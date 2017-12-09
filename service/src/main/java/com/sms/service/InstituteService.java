package com.sms.service;

import com.sms.domain.InterestTestResult;
import com.sms.university.Institute;

import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public interface InstituteService {

    void save(Institute institute);

    List<Institute> findInstitutesByInterest(InterestTestResult universitySearchCriteria);
}