package com.sms.university;

import com.sms.common.Entity;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

/**
 * Created by umars on 12/9/2017.
 */
@Document(collection = "university")
public class University extends Entity {
    private final String  name;

    @PersistenceConstructor
    public University(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}