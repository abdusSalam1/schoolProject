package com.sms.handler;

import com.sms.Model.QAModel;
import com.sms.domain.InterestTestResult;
import com.sms.domain.TestType;
import com.sms.factory.TestExpertFactory;
import com.sms.service.UniversityService;
import com.sms.university.University;


import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public class UniversityHandler {

    private final UniversityService universityService;
    private final TestExpertFactory testExpertFactory;

    public UniversityHandler(UniversityService universityService, TestExpertFactory testExpertFactory) {
        this.universityService = universityService;
        this.testExpertFactory = testExpertFactory;
    }

    public List<University> findUniversitiesByInterestTest(List<QAModel> qaModels) {
        InterestTestResult interestTestResult = (InterestTestResult) testExpertFactory.createExpert(TestType.INTEREST).getResult(qaModels);
        return universityService.findUniversitiesByInterest(interestTestResult);
    }
}