package com.sms.config;

import com.sms.handler.LoginHandler;
import com.sms.service.LoginService;
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
    public LoginHandler loginHandler(LoginService loginService) {
        return new LoginHandler(loginService);
    }
}