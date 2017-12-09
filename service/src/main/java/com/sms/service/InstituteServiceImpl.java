package com.sms.service;

import com.sms.domain.InterestTestResult;
import com.sms.repository.UniversityRepository;
import com.sms.university.Institute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public class InstituteServiceImpl implements InstituteService {

    private final UniversityRepository universityRepository;

    public InstituteServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public void save(Institute institute) {
        universityRepository.save(institute);
    }

    @Override
    public List<Institute> findInstitutesByInterest(InterestTestResult interestTestResult) {
        switch (interestTestResult.getInstituteName()) {
            case "IUB":
                return Arrays.asList(new Institute(UUID.randomUUID(), "IUB"));
            case "NUST":
                return Arrays.asList(new Institute(UUID.randomUUID(), "NUST"));
            default:
                return new ArrayList<>();
        }
    }
}
