package com.sms.config;

import com.mongodb.MongoClient;
import com.sms.repository.LoginRepository;
import com.sms.repository.LoginRepositoryImpl;
import com.sms.repositorydo.LoginDORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.DbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

/**
 * Created by Abdus Salam on 3/9/17.
 */
@Configuration
@Import( {MongoConfiguration.class})
public class PersistenceConfiguration {

    @Autowired
    private String defaultDatabaseName;

    @Autowired
    private MongoClient mongoClient;

    @Bean
    @Autowired
    public LoginRepository loginRepository(LoginDORepository loginDORepository) {
        return new LoginRepositoryImpl(loginDORepository);
    }

    @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(new SimpleMongoDbFactory(mongoClient, defaultDatabaseName), mappingMongoConverter());
    }

    @Bean
    MappingMongoConverter mappingMongoConverter() throws Exception {
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(new SimpleMongoDbFactory(mongoClient, defaultDatabaseName));
        return new MappingMongoConverter(dbRefResolver, new MongoMappingContext());
    }
}