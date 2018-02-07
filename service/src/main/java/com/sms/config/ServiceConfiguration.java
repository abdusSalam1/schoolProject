package com.sms.config;

import com.sms.repository.LoginRepository;
import com.sms.service.LoginService;
import com.sms.service.LoginServiceImpl;
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
    public LoginService loginService(LoginRepository loginRepository) {
        return new LoginServiceImpl(loginRepository);
    }
}