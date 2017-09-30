package com.sms.handler;

import com.sms.Model.EmployeeModel;
import com.sms.service.EmployeeService;
import org.springframework.http.HttpStatus;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public class EmployeeHandler {

    private final EmployeeService employeeService;

    public EmployeeHandler(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public HttpStatus save(EmployeeModel employeeModel) {
        return HttpStatus.OK;
    }
}