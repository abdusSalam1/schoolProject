package com.sms.repositorydo;

import com.sms.university.University;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public interface UniversityDORepository extends MongoRepository<University, UUID> {

}
