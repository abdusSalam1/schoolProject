package com.sms.common;


import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public abstract class Entity implements Serializable {

    @Id
    private final UUID id;

    protected Entity(UUID id) {
        this.id = id;
    }

    protected Entity() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
}