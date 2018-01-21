package com.w3xplorers.loginwithmvp.login;

/**
 * Created by DELL on 1/21/2018.
 */

public interface LoginInteractor {

    interface onLoginFinishedListener{
        void onUserNameError();
        void onPasswordError();
        void onSuccess();
        void onFailure(String msg);
    }

    void login(String username,String password,onLoginFinishedListener listener);
}
