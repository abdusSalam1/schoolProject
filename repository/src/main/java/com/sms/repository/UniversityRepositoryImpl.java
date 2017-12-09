package com.sms.repository;

import com.sms.repositorydo.UniversityDORepository;
import com.sms.university.University;
import com.sms.university.UniversitySearchCriteria;

import java.util.List;

/**
 * Created by Click Chain on 9/30/2017.
 */
public class UniversityRepositoryImpl extends GenericRepository<University> implements UniversityRepository {


    public UniversityRepositoryImpl(UniversityDORepository repository) {
        super(repository);
    }

    @Override
    public List<University> findBySearchCriteria(UniversitySearchCriteria universitySearchCriteria) {
        return null;
    }
}