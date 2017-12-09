package com.sms.domain;

/**
 * Created by umars on 12/9/2017.
 */
public class InterestTestResult {

    private String universityName;
    private String course;

    public InterestTestResult() {
    }

    public InterestTestResult(String universityName, String course) {
        this.universityName = universityName;
        this.course = course;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getCourse() {
        return course;
    }
}
