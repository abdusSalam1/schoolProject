package com.sms.repositorydo;

import com.sms.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.UUID;

/**
 * Created by umars on 2/7/2018.
 */
public interface LoginDORepository extends MongoRepository<User, UUID> {

    @Query(value = "{$and :[{'email' : ?0}, {'password' : ?1}]}")
    User authenticate(String email, String password);
}
