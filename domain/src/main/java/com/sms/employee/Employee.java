package com.sms.employee;

import com.sms.common.Entity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Created by Abdus Salam on 9/30/2017.
 */

@Document(collection = "employee")
public class Employee extends Entity {

    @PersistenceConstructor
    public Employee(UUID id) {
        super(id);
    }
}
