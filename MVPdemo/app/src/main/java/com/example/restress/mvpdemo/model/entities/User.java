package com.example.restress.mvpdemo.model.entities;

/**
 * Created by restress on 2017/11/29.
 */

public class User {
    private String password;
    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{"+
                "password='" + password +'\''+
                ",username='" + username + '\''+
                '}';
    }
}
