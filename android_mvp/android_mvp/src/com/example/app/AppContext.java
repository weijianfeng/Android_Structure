package com.example.app;

import android.app.Application;

public class AppContext extends Application {

	private static AppContext mAppContext;

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mAppContext = this;
	}

	public static AppContext getAppContext() {
		return mAppContext;
	}
}
