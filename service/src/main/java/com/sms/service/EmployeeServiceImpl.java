package com.sms.service;

import com.sms.employee.Employee;
import com.sms.repository.EmployeeRepository;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }
}
