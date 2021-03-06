package com.sms.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public interface Repository<T> extends CrudRepository<T, UUID> {
}
