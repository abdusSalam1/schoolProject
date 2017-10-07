package com.sms.controller;

import com.sms.Model.EmployeeModel;
import com.sms.handler.EmployeeHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
@RequestMapping(value = "/employee")
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeHandler employeeHandler;

    @ResponseBody
    @RequestMapping(method = RequestMethod.HEAD)
    public HttpStatus saveEmployee(@RequestBody EmployeeModel employeeModel) {
        return employeeHandler.save(employeeModel);
    }
}