package com.sms.model;

/**
 * Created by umars on 2/7/2018.
 */
public class UserModel {

    private String email;
    private String password;

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserModel() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
