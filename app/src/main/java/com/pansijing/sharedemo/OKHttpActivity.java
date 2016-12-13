package com.pansijing.sharedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pansijing.proguardlib.PostExample;

import java.io.IOException;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class OKHttpActivity extends AppCompatActivity {

    private static final String TAG = "OKHttpActivity";

    private Button mBtnClick;
    private TextView mTvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_okhttp);

        initView();
        initData();
    }

    private void initView() {
        mBtnClick = (Button) findViewById(R.id.okhttp_btn_click);
        mTvContent = (TextView) findViewById(R.id.okhttp_tv_content);
    }

    private void initData() {
        mBtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                testOKHttp();
            }
        });
    }

    private void testOKHttp() {
        Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                PostExample example = new PostExample();
                String json = example.bowlingJson("Jesse", "Jake");
                try {
                    String response = example.post("http://www.roundsapp.com/post", json);

                    subscriber.onNext(response);

                    Log.e(TAG, "testOKHttp: " + response);
                } catch (IOException e) {
                    Log.e(TAG, "testOKHttp: ", e);
                }
            }
        }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        mTvContent.setText(s);
                    }
                });

    }
}
