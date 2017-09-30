package com.sms.repositorydo;

import com.sms.employee.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public interface EmployeeDORepository extends MongoRepository<Employee, UUID> {
}
