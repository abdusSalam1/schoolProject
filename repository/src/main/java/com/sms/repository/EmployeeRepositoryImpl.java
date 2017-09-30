package com.sms.repository;

import com.sms.employee.Employee;
import com.sms.repositorydo.EmployeeDORepository;

/**
 * Created by Click Chain on 9/30/2017.
 */
public class EmployeeRepositoryImpl extends GenericRepository<Employee> implements EmployeeRepository {

    public EmployeeRepositoryImpl(EmployeeDORepository repository) {
        super(repository);
    }
}