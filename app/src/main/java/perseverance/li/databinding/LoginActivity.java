package perseverance.li.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import perseverance.li.databinding.utils.ClickHandler;
import perseverance.li.databinding.model.User;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LoginActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.login_layout);

        User user = new User();
        user.setUserName("perseverance.li");
        user.setPwd("123456789");
        user.setUserNameHint("请输入用户名");
        user.setPwdHint("请输入密码");
        //将数据设置到view
        binding.setUser(user);

        binding.setClick(new ClickHandler());
    }
}
