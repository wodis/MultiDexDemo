package com.openwudi.multidexdemo;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by wudi on 14-12-11.
 */
public class DemoApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
