package com.sms.handler;

import com.sms.model.InstituteModel;
import com.sms.model.QAModel;
import com.sms.domain.InterestTestResult;
import com.sms.domain.TestType;
import com.sms.factory.TestExpertFactory;
import com.sms.service.InstituteService;
import com.sms.university.Institute;


import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public class InstitutionHandler {

    private final InstituteService instituteService;
    private final TestExpertFactory testExpertFactory;

    public InstitutionHandler(InstituteService instituteService, TestExpertFactory testExpertFactory) {
        this.instituteService = instituteService;
        this.testExpertFactory = testExpertFactory;
    }

    public List<InstituteModel> findInstituitionsByInterestTest(List<QAModel> qaModels) {
        InterestTestResult interestTestResult = (InterestTestResult) testExpertFactory.createExpert(TestType.INTEREST).getResult(qaModels);
        return transformToInstituteModel(instituteService.findInstitutesByInterest(interestTestResult));
    }

    private List<InstituteModel> transformToInstituteModel(List<Institute> institutes){
        return institutes.stream().map(InstituteModel :: new).collect(Collectors.toList());
    }
}