package com.w3xplorers.loginwithmvp.login;

import android.text.TextUtils;
import android.os.Handler;

/**
 * Created by Avijit on 1/21/2018.
 */

public class LoginInteractorImpl implements LoginInteractor{
    @Override
    public void login(String username, String password, final onLoginFinishedListener listener) {
        if(TextUtils.isEmpty(username)){
            listener.onUserNameError();
        }else if(TextUtils.isEmpty(password)){
            listener.onPasswordError();
        }else if(username.equals("Admin") && password.equals("123456")){

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    listener.onSuccess();
                }
            },3000);

        }else{
            listener.onFailure("Invalid Credentials!");
        }
    }
}
