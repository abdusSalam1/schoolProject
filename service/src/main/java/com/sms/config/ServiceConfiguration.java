package com.sms.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Click Chain on 9/3/2017.
 */
@Configuration
@Import(PersistenceConfiguration.class)
public class ServiceConfiguration {
}
