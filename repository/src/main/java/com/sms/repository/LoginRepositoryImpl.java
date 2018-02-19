package com.sms.repository;

import com.sms.repositorydo.LoginDORepository;
import com.sms.domain.User;

/**
 * Created by umars on 2/7/2018.
 */
public class LoginRepositoryImpl extends GenericRepository<User> implements LoginRepository {
    private final LoginDORepository repository;

    public LoginRepositoryImpl(LoginDORepository repository) {
        super(repository);
        this.repository = repository;
    }

    @Override
    public boolean authenticate(String email, String password) {
        User user = repository.authenticate(email,password);
        return user!=null && user.getEmail().equals(email);
    }
}
