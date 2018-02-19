package com.sms.service;

/**
 * Created by umars on 2/7/2018.
 */
public interface LoginService {
    boolean authenticate(String email, String password);
}
