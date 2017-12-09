package com.sms.Model;

import com.sms.domain.InterestBasedTest;
import com.sms.domain.QA;

/**
 * Created by umars on 12/9/2017.
 */

public class InterestBasedQAModel extends QAModel {

    public InterestBasedQAModel(String questionId, String answer) {
        super(questionId, answer);
    }

    @Override
    public InterestBasedTest toQA() {
        return new InterestBasedTest(getQuestionId(),getAnswer());
    }
}