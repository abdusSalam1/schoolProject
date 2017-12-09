package com.sms.domain;

/**
 * Created by umars on 12/9/2017.
 */
public class InterestTestResult {

    private String instituteName;
    private String course;

    public InterestTestResult() {
    }

    public InterestTestResult(String instituteName, String course) {
        this.instituteName = instituteName;
        this.course = course;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public String getCourse() {
        return course;
    }
}
