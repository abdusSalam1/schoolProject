package com.sms.config;

import com.sms.factory.TestExpertFactory;
import com.sms.handler.InstitutionHandler;
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
@Import({ServiceConfiguration.class})
public class WebApplicationConfiguration {

    @Bean
    @Autowired
    public InstitutionHandler employeeHandler(InstituteService instituteService) {
        return new InstitutionHandler(instituteService, new TestExpertFactory());
    }
}