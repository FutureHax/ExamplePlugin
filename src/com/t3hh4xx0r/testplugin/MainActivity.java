package com.t3hh4xx0r.testplugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends Activity {
	//This must be the name f the preferences file
    public static final String PREFERENCES_KEY = "plugin_preferences";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		//you need some activity so that the broadcat intents can be registered.
		//If you want to put a little "about" page with your info here, you can go ahead and do that.
		//You also need to build your sharedpreferences here with the MODE WORLD WRITABLE option.
		//The "shouldshow" should be set here by defaul to true. 
		final SharedPreferences prefs = this.getSharedPreferences(PREFERENCES_KEY, Context.MODE_WORLD_WRITEABLE);
		if (!prefs.getBoolean("shouldShow", false)) {
			prefs.edit().putBoolean("shouldShow", true).apply();
		}
	}
}
