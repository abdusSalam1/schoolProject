package com.sms.handler;

import com.sms.domain.User;
import com.sms.model.LoginResponseModel;
import com.sms.model.UserModel;
import com.sms.service.LoginService;

/**
 * Created by umars on 2/7/2018.
 */
public class LoginHandler {

    private final LoginService loginService;

    public LoginHandler(LoginService loginService) {
        this.loginService = loginService;
    }

    public LoginResponseModel authenticate(UserModel userModel) {
        boolean authenticated = loginService.authenticate(userModel.getEmail(),userModel.getPassword());
        if (authenticated){
            return new LoginResponseModel("ok");
        }
        else {
            return new LoginResponseModel("not authenticated");
        }
    }
}
