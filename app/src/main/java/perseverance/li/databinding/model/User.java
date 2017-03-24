package perseverance.li.databinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;

import perseverance.li.databinding.BR;


/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-21 17:36
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-21 17 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class User extends BaseObservable {

    private String userName;
    private String pwd;
    private String userNameHint;
    private String pwdHint;
    private boolean loginSuccess;

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
        notifyPropertyChanged(BR.pwd);
    }

    @Bindable
    public String getUserNameHint() {
        return userNameHint;
    }

    public void setUserNameHint(String userNameHint) {
        this.userNameHint = userNameHint;
        notifyPropertyChanged(BR.userNameHint);
    }

    @Bindable
    public String getPwdHint() {
        return pwdHint;
    }

    public void setPwdHint(String pwdHint) {
        this.pwdHint = pwdHint;
        notifyPropertyChanged(BR.pwdHint);
    }

    @Bindable
    public boolean isLoginSuccess() {
        return loginSuccess;
    }

    public void setLoginSuccess(boolean loginSuccess) {
        this.loginSuccess = loginSuccess;
        notifyPropertyChanged(BR.loginSuccess);
    }

}
