package com.w3xplorers.loginwithmvp.login;

/**
 * Created by Avijit on 1/21/2018.
 */

public interface LoginView {
    void showProgress();
    void hideProgress();
    void setUserNameError();
    void setPasswordError();
    void navigatetoMain();
    void showAlert(String msg);
}
