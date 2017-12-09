package com.sms.service;

import com.sms.domain.InterestTestResult;
import com.sms.university.University;

import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public interface UniversityService {

    void save(University university);

    List<University> findUniversitiesByInterest(InterestTestResult universitySearchCriteria);
}
