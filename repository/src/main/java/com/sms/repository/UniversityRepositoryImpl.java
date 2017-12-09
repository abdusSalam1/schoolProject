package com.sms.repository;

import com.sms.repositorydo.UniversityDORepository;
import com.sms.university.Institute;
import com.sms.university.UniversitySearchCriteria;

import java.util.List;

/**
 * Created by Click Chain on 9/30/2017.
 */
public class UniversityRepositoryImpl extends GenericRepository<Institute> implements UniversityRepository {


    public UniversityRepositoryImpl(UniversityDORepository repository) {
        super(repository);
    }

    @Override
    public List<Institute> findBySearchCriteria(UniversitySearchCriteria universitySearchCriteria) {
        return null;
    }
}