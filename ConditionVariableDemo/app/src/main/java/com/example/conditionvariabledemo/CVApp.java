package com.example.conditionvariabledemo;

import android.app.Application;
import android.content.Context;

public class CVApp extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContextBase() {
        return mContext;
    }
}
