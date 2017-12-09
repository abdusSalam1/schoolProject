package com.sms.config;

import com.sms.repository.UniversityRepository;
import com.sms.service.UniversityService;
import com.sms.service.UniversityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Abdus Salam on 9/3/2017.
 */
@Configuration
@Import(PersistenceConfiguration.class)
public class ServiceConfiguration {

    @Bean
    @Autowired
    public UniversityService employeeService(UniversityRepository universityRepository) {
        return new UniversityServiceImpl(universityRepository);
    }
}