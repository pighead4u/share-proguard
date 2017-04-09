package com.pansijing.sharedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.pansijing.sharedemo.BuildConfig;

public class MainActivity extends AppCompatActivity {

  private static final String TAG = MainActivity.class.getSimpleName();

  private Button mBtnGlide;
  private Button mBtnOKHttp;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    if (BuildConfig.DEBUG) {
      Log.e(TAG, "onCreate: " + BuildConfig.VERSION_CODE);
      Log.e(TAG, "onCreate: " + BuildConfig.yourName);
    }

    initView();
    initData();
  }

  private void initView() {
    mBtnGlide = (Button) findViewById(R.id.main_btn_glide);
    mBtnOKHttp = (Button) findViewById(R.id.main_btn_okhttp);
  }

  private void initData() {
    mBtnGlide.setOnClickListener(new View.OnClickListener() {

      @Override public void onClick(View view) {
        gotoGlideActivity();
      }
    });

    mBtnOKHttp.setOnClickListener(new View.OnClickListener() {

      @Override public void onClick(View view) {
        gotoOKHttpActivity();
      }
    });
  }

  private void gotoGlideActivity() {
    Intent intent = new Intent();
    intent.setClass(this, GlideActivity.class);
    startActivity(intent);
  }

  private void gotoOKHttpActivity() {
    Intent intent = new Intent();
    intent.setClass(this, OKHttpActivity.class);
    startActivity(intent);
  }
}
