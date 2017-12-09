package com.sms.service;

import com.sms.repository.UniversityRepository;
import com.sms.university.University;
import com.sms.university.UniversitySearchCriteria;

import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public class UniversityServiceImpl implements UniversityService {

    private final UniversityRepository universityRepository;

    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public void save(University university) {
        universityRepository.save(university);
    }

    @Override
    public List<University> findUniversitiesBySearchCriteria(UniversitySearchCriteria universitySearchCriteria) {
        return universityRepository.findBySearchCriteria(universitySearchCriteria);
    }
}
