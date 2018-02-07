package com.sms.repositorydo;

import com.sms.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

/**
 * Created by umars on 2/7/2018.
 */
public interface LoginDORepository extends MongoRepository<User, UUID> {
}
