package com.sms.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.mapping.model.FieldNamingStrategy;
import org.springframework.data.mapping.model.PropertyNameFieldNamingStrategy;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Abdus Salam on 3/9/17.
 */
@Configuration
@Import({MongoConfiguration.class})
public class PersistenceConfiguration {

    @Autowired
    private String defaultDatabaseName;

    @Autowired
    private MongoClient mongoClient;

    @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(new SimpleMongoDbFactory(mongoClient, defaultDatabaseName), mappingMongoConverter());
    }

    @Bean
    MappingMongoConverter mappingMongoConverter() throws Exception {
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(new SimpleMongoDbFactory(mongoClient, defaultDatabaseName));
        MappingMongoConverter converter = new MappingMongoConverter(dbRefResolver, mongoMappingContext());
        return converter;
    }

    @Bean
    MongoMappingContext mongoMappingContext() throws ClassNotFoundException {
        MongoMappingContext mappingContext = new MongoMappingContext();
        mappingContext.setInitialEntitySet(getInitialEntitySet());
        mappingContext.setFieldNamingStrategy(fieldNamingStrategy());

        return mappingContext;
    }

    private Set<Class<?>> getInitialEntitySet() throws ClassNotFoundException {

        String basePackage = getMappingBasePackage();
        Set<Class<?>> initialEntitySet = new HashSet<Class<?>>();

        if (StringUtils.hasText(basePackage)) {
            ClassPathScanningCandidateComponentProvider componentProvider = new ClassPathScanningCandidateComponentProvider(
                    false);
            componentProvider.addIncludeFilter(new AnnotationTypeFilter(Document.class));
            componentProvider.addIncludeFilter(new AnnotationTypeFilter(Persistent.class));

            for (BeanDefinition candidate : componentProvider.findCandidateComponents(basePackage)) {
                initialEntitySet.add(ClassUtils.forName(candidate.getBeanClassName(),
                        AbstractMongoConfiguration.class.getClassLoader()));
            }
        }
        return initialEntitySet;
    }

    private FieldNamingStrategy fieldNamingStrategy() {
        return PropertyNameFieldNamingStrategy.INSTANCE;
    }

    private String getMappingBasePackage() {
        Package mappingBasePackage = getClass().getPackage();
        return mappingBasePackage == null ? null : mappingBasePackage.getName();
    }
}