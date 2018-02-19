package com.sms.controller;

import com.sms.model.InstituteModel;
import com.sms.model.QAModel;
import com.sms.handler.InstitutionHandler;
import com.sms.university.Institute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
@RequestMapping(value = "/institutions")
@Controller
public class InstitutionController {

    @Autowired
    private InstitutionHandler institutionHandler;

    @ResponseBody
    @RequestMapping(value = "/interest-test", method = RequestMethod.GET)
    public List<InstituteModel> findInstituitionsByInterestTest(@RequestBody List<QAModel> qaModels) {
        return institutionHandler.findInstituitionsByInterestTest(qaModels);
    }

    @ResponseBody
    @RequestMapping(value = "/interest", method = RequestMethod.GET)
    public List<InstituteModel> find() {
        return new ArrayList<>();
    }
}