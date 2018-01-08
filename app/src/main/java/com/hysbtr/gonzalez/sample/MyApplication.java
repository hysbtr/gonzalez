package com.hysbtr.gonzalez.sample;

import android.app.Application;

import com.hysbtr.gonzalez.GonScreenAdapter;

/**
 * Created by guoxiaodong on 30/12/2017 19:59
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        GonScreenAdapter.getInstance().init(getResources().getDisplayMetrics());
    }
}
