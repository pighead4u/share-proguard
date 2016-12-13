package com.pansijing.sharedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideActivity extends AppCompatActivity {

    ImageView mIVContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        initView();
        initData();
    }

    private void initView() {
        mIVContent =(ImageView) findViewById(R.id.glide_iv_content);
    }

    private void initData() {

        Glide.with(this)
                .load("http://ww4.sinaimg.cn/large/610dc034jw1fanrdyaxi6j20u00k1ta9.jpg")
                .into(mIVContent);
    }
}
