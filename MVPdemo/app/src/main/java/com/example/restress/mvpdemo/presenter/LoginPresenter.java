package com.example.restress.mvpdemo.presenter;

import com.example.restress.mvpdemo.model.entities.User;

/**
 * Created by restress on 2017/11/29.
 */
//登陆的activity的接口view的presenter接口
public interface LoginPresenter {
    void validateCredentials(User user);

    void onDestroy();
}
