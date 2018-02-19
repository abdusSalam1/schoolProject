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
 * Created by Abdus Salam on 2/14/2018.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginHandler loginHandler;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponseModel authenticate(@RequestBody UserModel userModel) {
        return loginHandler.authenticate(userModel);
    }

    @ResponseBody
    @RequestMapping(value = "/v1/login", method = RequestMethod.POST)
    public String find() {
        return "Hi2";
    }

}
