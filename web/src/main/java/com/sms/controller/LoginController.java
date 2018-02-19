package com.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Abdus Salam on 2/14/2018.
 */
@Controller
public class LoginController {

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String findInstituitionsByInterestTest() {
        return "Hi1";
    }

    @ResponseBody
    @RequestMapping(value = "/v1/login", method = RequestMethod.POST)
    public String find() {
        return "Hi2";
    }

}