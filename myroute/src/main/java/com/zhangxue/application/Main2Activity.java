package com.zhangxue.application;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zhangxue.application.route.Router;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button) findViewById(R.id.main2btn);
        Uri data = getIntent().getData();
        if (data != null) {
            String age = data.getQueryParameter("age");
            button.setText(age);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    new Router().build(getResources().getString(R.string.app_scheme) + "://" + getResources().getString(R.string.app_mainactivity_host) + "?name=zhang").setResults(Main2Activity.this, 0x1111);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
