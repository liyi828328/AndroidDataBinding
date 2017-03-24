package perseverance.li.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-24 14:05
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-24 14 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OtherActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.other_activity);
        //使用BindingConversion
        binding.setTime(new Date());
        //使用表达式
        binding.setState(true);
        //设置List相关
        ArrayList<String> listData = new ArrayList<>();
        listData.add("我是ListData_1");
        listData.add("我是ListData_2");
        listData.add("我是ListData_3");
        binding.setListData(listData);
        binding.setListIndex(2);
        //设置Map相关
        HashMap<String, String> mapData = new HashMap<>();
        mapData.put("name","我是名字");
        mapData.put("age","我是年龄");
        binding.setMapData(mapData);
        binding.setMapKey("name");
    }
}
