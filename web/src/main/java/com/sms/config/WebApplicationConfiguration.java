package com.sms.config;

import com.sms.factory.TestExpertFactory;
import com.sms.handler.InstitutionHandler;
import com.sms.security.AuthorizationServerConfiguration;
import com.sms.security.ResourceServerConfiguration;
import com.sms.security.SecurityConfiguration;
import com.sms.security.SecurityWebApplicationInitializer;
import com.sms.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Click Chain on 9/3/2017.
 */
@EnableWebMvc
@ComponentScan(basePackages = {"com.sms.controller"})
@Configuration
@Import( {ServiceConfiguration.class, AuthorizationServerConfiguration.class, SecurityConfiguration.class, ResourceServerConfiguration.class, SecurityWebApplicationInitializer.class})
public class WebApplicationConfiguration {


    @Bean(name = "ssl")
    public Boolean ssl() {
        return false;
    }

    @Bean
    @Autowired
    public InstitutionHandler employeeHandler(InstituteService instituteService) {
        return new InstitutionHandler(instituteService, new TestExpertFactory());
    }
}