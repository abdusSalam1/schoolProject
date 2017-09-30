package com.sms.config;

import com.sms.repository.EmployeeRepository;
import com.sms.service.EmployeeService;
import com.sms.service.EmployeeServiceImpl;
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
    public EmployeeService employeeService(EmployeeRepository employeeRepository) {
        return new EmployeeServiceImpl(employeeRepository);
    }
}