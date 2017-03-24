package perseverance.li.databinding.utils;

import android.view.View;
import android.widget.Toast;

import perseverance.li.databinding.model.User;

/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-22 11:36
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-22 11 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class ClickHandler {

    public void login(View view) {
        User user = (User) view.getTag();
        boolean isSuccess = "perseverance.li".equals(user.getUserName());
        Toast.makeText(view.getContext(), "登录" + (isSuccess ? "成功" : "失败") + "\r\nUserName : " + user.getUserName() + "\r\n" + "Password: " + user.getPwd(),
                Toast.LENGTH_SHORT).show();
        user.setLoginSuccess(isSuccess);
    }

    public void change(View view) {
        User user = (User) view.getTag();
        user.setUserName("change user");
        user.setPwd("change pwd");
        user.setLoginSuccess(false);
    }
}
