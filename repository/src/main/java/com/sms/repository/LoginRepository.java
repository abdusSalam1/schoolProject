package com.sms.repository;

import com.sms.domain.User;

/**
 * Created by umars on 2/7/2018.
 */
public interface LoginRepository extends Repository<User> {
    boolean authenticate(String email, String password);
}
