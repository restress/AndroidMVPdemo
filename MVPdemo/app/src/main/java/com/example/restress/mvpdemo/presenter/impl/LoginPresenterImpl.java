package com.example.restress.mvpdemo.presenter.impl;

import com.example.restress.mvpdemo.model.LoginModel;
import com.example.restress.mvpdemo.model.entities.User;
import com.example.restress.mvpdemo.model.impl.LoginModelImpl;
import com.example.restress.mvpdemo.presenter.LoginPresenter;
import com.example.restress.mvpdemo.presenter.OnLoginFinishedListener;
import com.example.restress.mvpdemo.ui.LoginView;

/**
 * Created by restress on 2017/11/29.
 */

public class LoginPresenterImpl implements LoginPresenter,OnLoginFinishedListener {
    private LoginView loginView;
    private LoginModel loginModel;

    public LoginPresenterImpl(LoginView loginView){
        this.loginView = loginView;
        this.loginModel = new LoginModelImpl();
    }

    @Override
    public void validateCredentials(User user) {
        if (loginView != null){
            loginView.showProgress();
        }

        loginModel.login(user,this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUsernameError() {
        if (loginView != null){
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null){
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null){
            loginView.showSuccess();
        }
    }
}
