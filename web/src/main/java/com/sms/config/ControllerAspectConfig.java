package com.sms.config;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by jazib on 11/3/2017.
 */
public class ControllerAspectConfig {

    @Pointcut("within(@org.springframework.stereotype.Controller *)")
    public void controller() {
    }


    @Pointcut("execution(* com.sms.controller.StaticResourceController.*(..))")
    public void staticResourcesController() {
    }

    @Pointcut("execution(* com.sms.controller.IndexController.*(..))")
    public void indexController() {
    }
}
