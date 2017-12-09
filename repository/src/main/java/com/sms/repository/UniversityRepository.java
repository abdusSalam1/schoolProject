package com.sms.repository;

import com.sms.university.Institute;
import com.sms.university.UniversitySearchCriteria;

import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public interface UniversityRepository extends Repository<Institute> {
    List<Institute> findBySearchCriteria(UniversitySearchCriteria universitySearchCriteria);
}
