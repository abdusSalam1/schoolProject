package com.sms.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public class UniversitySearchModel {

    List<QAModel> qaModels = new ArrayList<>();

    public UniversitySearchModel() {
    }

    public UniversitySearchModel(List<QAModel> qaModels) {

        this.qaModels = qaModels;
    }

    public List<QAModel> getQaModels() {
        return qaModels;
    }

    public void setQaModels(List<QAModel> qaModels) {
        this.qaModels = qaModels;
    }
}