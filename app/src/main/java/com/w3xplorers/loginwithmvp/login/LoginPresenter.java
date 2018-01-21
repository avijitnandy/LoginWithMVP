package com.w3xplorers.loginwithmvp.login;

/**
 * Created by Avijit on 1/21/2018.
 */

public interface LoginPresenter {

    void validateCred(String userName,String password);
    void onDestroy();
}
