package com.sms.service;

import com.sms.domain.InterestTestResult;
import com.sms.repository.UniversityRepository;
import com.sms.university.University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

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
    public List<University> findUniversitiesByInterest(InterestTestResult interestTestResult) {
        switch (interestTestResult.getUniversityName()) {
            case "IUB":
                return Arrays.asList(new University(UUID.randomUUID(), "IUB"));
            case "NUST":
                return Arrays.asList(new University(UUID.randomUUID(), "NUST"));
            default:
                return new ArrayList<>();
        }
    }
}
