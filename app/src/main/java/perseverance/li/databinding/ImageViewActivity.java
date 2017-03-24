package perseverance.li.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-23 13:56
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-23 13 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageViewActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.imageview_layout);
        binding.setImageResId(R.mipmap.ic_necessary);

        binding.setImageUrl("https://raw.githubusercontent.com/liyi828328/MVP/master/MVP.png");
    }
}
