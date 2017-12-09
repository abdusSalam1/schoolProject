package com.sms.factory;

import com.sms.domain.TestType;
import com.sms.expert.InterestTestExpert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Abdus Salam on 12/9/2017.
 */
public class TestExpertFactoryTest {

    @Test
    public void whenInterestBasedTypeIsGivenShouldReturnInterestBasedExpert() {
        TestExpertFactory testExpertFactory = new TestExpertFactory();
        assertTrue(testExpertFactory.createExpert(TestType.INTEREST).getClass().equals(InterestTestExpert.class));
    }
}