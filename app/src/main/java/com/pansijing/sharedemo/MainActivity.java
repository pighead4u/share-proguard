package com.pansijing.sharedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnGlide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initView() {
        mBtnGlide = (Button) findViewById(R.id.main_btn_glide);
    }

    private void initData() {
        mBtnGlide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                gotoGlideActivity();
            }
        });
    }

    private void gotoGlideActivity() {
        Intent intent = new Intent();
        intent.setClass(this, GlideActivity.class);
        startActivity(intent);
    }
}
