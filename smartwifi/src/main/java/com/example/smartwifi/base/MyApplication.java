package com.example.smartwifi.base;

import android.app.Application;

import com.example.smartwifi.utils.PreferenceUtil;


public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		PreferenceUtil.init(this);
	}

}
