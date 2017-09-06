package com.walxy.topbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Topbar topbar=(Topbar)findViewById(R.id.topbar);
        assert topbar != null;
        topbar.setOnTopbarClickListener(new Topbar.topbarClickListener() {
            @Override
            public void leftButtonClick() {
                Toast.makeText(MainActivity.this, "点击了返回", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightButtonClick() {
                Toast.makeText(MainActivity.this, "点击了更多", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
