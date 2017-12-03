package com.example.restress.mvpdemo.model;

import com.example.restress.mvpdemo.model.entities.User;
import com.example.restress.mvpdemo.presenter.OnLoginFinishedListener;

/**
 * Created by restress on 2017/11/29.
 */
//model接口；数据判断之后调用presenter中的方法
public interface LoginModel {
    void login(User user, OnLoginFinishedListener listener);
}
