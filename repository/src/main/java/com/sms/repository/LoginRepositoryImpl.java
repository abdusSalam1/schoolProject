package com.sms.repository;

import com.sms.repositorydo.LoginDORepository;
import com.sms.domain.User;

/**
 * Created by umars on 2/7/2018.
 */
public class LoginRepositoryImpl extends GenericRepository<User> implements LoginRepository {

    public LoginRepositoryImpl(LoginDORepository repository) {
        super(repository);
    }
}
