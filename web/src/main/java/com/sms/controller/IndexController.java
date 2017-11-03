package com.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jazib on 11/3/2017.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String homePage() {
        return "static/public/index.html";
    }
}
