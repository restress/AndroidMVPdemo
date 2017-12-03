package com.example.restress.mvpdemo.model.impl;

import android.os.Handler;
import android.text.TextUtils;

import com.example.restress.mvpdemo.model.LoginModel;
import com.example.restress.mvpdemo.model.entities.User;
import com.example.restress.mvpdemo.presenter.OnLoginFinishedListener;


/**
 * Created by restress on 2017/11/29.
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public void login(User user, final OnLoginFinishedListener listener) {
        final String username  = user.getUsername();
        final String password = user.getPassword();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();//model层里面回调listener
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        },2000);
    }
}
