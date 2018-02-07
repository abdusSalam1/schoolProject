package com.sms.model;

/**
 * Created by umars on 2/7/2018.
 */
public class LoginResponseModel {
    private String message;

    public LoginResponseModel(String message) {
        this.message = message;
    }

    public LoginResponseModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
