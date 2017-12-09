package com.sms.expert;

import com.sms.domain.QA;

import java.util.List;

/**
 * Created by umars on 12/9/2017.
 */
public interface TestExpert<T> {

    T getResult(List<QA> questions);
}
