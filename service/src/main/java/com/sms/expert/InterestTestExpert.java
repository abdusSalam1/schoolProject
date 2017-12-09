package com.sms.expert;

import com.sms.domain.InterestTestResult;
import com.sms.domain.QA;

import java.util.List;

/**
 * Created by umars on 12/9/2017.
 */
public class InterestTestExpert implements TestExpert<InterestTestResult>{

    @Override
    public InterestTestResult getResult(List<QA> questions) {
        switch (questions.get(0).getAnswer()){
            case "A" : return new InterestTestResult("IUB","BSCS");
            case "B" : return new InterestTestResult("NUST","BSCS");
            case "C" : return new InterestTestResult("IUB","BSCS");
            case "D" : return new InterestTestResult("IUB","BSCS");
            default: return new InterestTestResult();
        }
    }
}
