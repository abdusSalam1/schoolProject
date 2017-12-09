package com.sms.expert;

import com.sms.domain.IntrestTestResult;
import com.sms.domain.QA;

import java.util.List;

/**
 * Created by umars on 12/9/2017.
 */
public class IntrestTestExpert implements TestExpert<IntrestTestResult>{

    @Override
    public IntrestTestResult getResult(List<QA> questions) {
        switch (questions.get(0).getAnswer()){
            case "A" : return new IntrestTestResult("IUB","BSCS");
            case "B" : return new IntrestTestResult("NUST","BSCS");
            case "C" : return new IntrestTestResult("IUB","BSCS");
            case "D" : return new IntrestTestResult("IUB","BSCS");
            default: return new IntrestTestResult();
        }
    }
}
