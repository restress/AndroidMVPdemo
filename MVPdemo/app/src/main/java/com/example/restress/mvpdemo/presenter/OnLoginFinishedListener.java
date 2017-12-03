package com.example.restress.mvpdemo.presenter;

/**
 * Created by restress on 2017/11/29.
 */
//model的接口
public interface OnLoginFinishedListener {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
