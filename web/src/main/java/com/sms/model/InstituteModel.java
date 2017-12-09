package com.sms.model;

import com.sms.university.Institute;

/**
 * Created by Abdus Salam on 12/9/2017.
 */
public class InstituteModel {

    private String name;

    public InstituteModel(Institute institute) {
        this.name = institute.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}