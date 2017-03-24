package perseverance.li.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * ---------------------------------------------------------------
 * Author: Perseverance.li
 * Create: 17-3-23 10:38
 * ---------------------------------------------------------------
 * Describe:
 * ---------------------------------------------------------------
 * Changes:
 * ---------------------------------------------------------------
 * 17-3-23 10 : Create by Perseverance.li
 * ---------------------------------------------------------------
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        findViewById(R.id.data_binding_1).setOnClickListener(this);
        findViewById(R.id.data_binding_2).setOnClickListener(this);
        findViewById(R.id.data_binding_3).setOnClickListener(this);
        findViewById(R.id.data_binding_4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.data_binding_1) {
            startActivity(new Intent(this, LoginActivity.class));
        } else if (id == R.id.data_binding_2) {
            startActivity(new Intent(this, ImageViewActivity.class));
        } else if (id == R.id.data_binding_3) {
            startActivity(new Intent(this, ListViewActivity.class));
        } else if (id == R.id.data_binding_4) {
            startActivity(new Intent(this, OtherActivity.class));
        }
    }
}
