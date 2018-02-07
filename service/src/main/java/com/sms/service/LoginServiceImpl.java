package com.sms.service;

import com.sms.repository.LoginRepository;

/**
 * Created by umars on 2/7/2018.
 */
public class LoginServiceImpl implements LoginService {

    private final LoginRepository loginRepository;

    public LoginServiceImpl(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }
}
