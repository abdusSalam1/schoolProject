package com.sms.factory;

import com.sms.domain.TestType;
import com.sms.expert.DummyExpert;
import com.sms.expert.InterestTestExpert;
import com.sms.expert.TestExpert;

/**
 * Created by Abdus Salam on 12/9/2017.
 */
public class TestExpertFactory {

    public TestExpert createExpert(TestType testType){
        switch (testType){
            case INTEREST:
                return new InterestTestExpert();
                default:
                    return new DummyExpert();
        }
    }
}
