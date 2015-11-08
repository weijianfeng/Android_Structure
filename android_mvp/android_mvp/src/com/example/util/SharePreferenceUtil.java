package com.example.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePreferenceUtil {
	private SharedPreferences sp;
	private SharedPreferences.Editor editor;

	public SharePreferenceUtil(Context context, String file) {
		sp = context.getSharedPreferences(file, context.MODE_PRIVATE);
		editor = sp.edit();
	}

	public void setData(String data) {
		editor.putString("data", data);
		editor.commit();
	}
	
	public String getData() {
		return sp.getString("data", null);
	}
}
