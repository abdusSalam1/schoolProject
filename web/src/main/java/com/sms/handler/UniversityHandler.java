package com.sms.handler;

import com.sms.Model.UniversitySearchModel;
import com.sms.expert.TestExpert;
import com.sms.service.UniversityService;
import com.sms.university.University;
import com.sms.university.UniversitySearchCriteria;


import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public class UniversityHandler {

    private final UniversityService universityService;

    public UniversityHandler(UniversityService universityService) {
        this.universityService = universityService;
    }

    public List<University> findUniversitiesBySearchCriteria(UniversitySearchModel universitySearchModel) {
        UniversitySearchCriteria universitySearchCriteria = null;
        return universityService.findUniversitiesBySearchCriteria(universitySearchCriteria);
    }
}