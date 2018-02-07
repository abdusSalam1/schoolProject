package com.sms.controller;

import com.sms.handler.LoginHandler;
import com.sms.model.LoginResponseModel;
import com.sms.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by umars on 2/7/2018.
 */
@RequestMapping(value = "/login")
@Controller
public class LoginController {

    @Autowired
    private LoginHandler loginHandler;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public LoginResponseModel authenticate(@RequestBody UserModel userModel) {
        return loginHandler.authenticate(userModel);
    }

}
