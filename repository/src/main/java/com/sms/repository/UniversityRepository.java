package com.sms.repository;

import com.sms.university.University;
import com.sms.university.UniversitySearchCriteria;

import java.util.List;

/**
 * Created by Abdus Salam on 9/30/2017.
 */
public interface UniversityRepository extends Repository<University> {
    List<University> findBySearchCriteria(UniversitySearchCriteria universitySearchCriteria);
}
