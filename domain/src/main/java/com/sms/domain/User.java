package com.sms.domain;

import com.sms.common.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Created by umars on 2/7/2018.
 */
@Document(collection = "user")
public class User extends Entity {

    private final String email;
    private final String password;

    public User(UUID id, String email, String password) {
        super(id);
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
