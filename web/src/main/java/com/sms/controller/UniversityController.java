package com.sms.controller;

import com.sms.Model.UniversitySearchModel;
import com.sms.handler.UniversityHandler;
import com.sms.university.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
@RequestMapping(value = "/university")
@Controller
public class UniversityController {

    @Autowired
    private UniversityHandler universityHandler;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<University> findUniversitiesBySearchCriteria(@RequestBody UniversitySearchModel universitySearchModel) {
        return universityHandler.findUniversitiesBySearchCriteria(universitySearchModel);
    }
}