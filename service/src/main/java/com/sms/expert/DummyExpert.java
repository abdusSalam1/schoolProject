package com.sms.expert;

import java.util.List;

/**
 * Created by Abdus Salam on 12/9/2017.
 */
public class DummyExpert implements TestExpert {
    @Override
    public Object getResult(List questions) {
        return "";
    }
}
