package com.example.restress.mvpdemo.ui;

/**
 * Created by restress on 2017/11/29.
 */
//实现view
public interface LoginView {
    //login是耗时操作，我们需要给用户一个有好的提示，一般就是操作ProgressBar
    void showProgress();

    void hideProgress();

    //loigin当然存在登陆成功与失败的处理，失败给出提示
    void setUsernameError();

    void setPasswordError();
    //login成功，也给个提示
    void showSuccess();
}
