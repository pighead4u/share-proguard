package com.pansijing.sharedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.pansijing.proguardlib.Student;

public class GlideActivity extends AppCompatActivity {

  private static final String TAG = "GlideActivity";

  ImageView mIVContent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_glide);

    initView();
    initData();
  }

  private void initView() {
    mIVContent = (ImageView) findViewById(R.id.glide_iv_content);
  }

  private void initData() {

    Glide.with(this)
        .load("http://ww4.sinaimg.cn/large/610dc034jw1fanrdyaxi6j20u00k1ta9.jpg")
        .into(mIVContent);

    testStudent();
  }

  private void testStudent() {
    Student student = new Student();
    student.name = "pansijing";
    student.age = 18;
    student.grade = 1;
    student.email = "pansijing@gmail.com";

    Log.d(TAG, "testStudent: " + student);
  }
}
