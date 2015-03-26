package com.mova.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.mova.snhu.R;

public class SplashScreen extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);

		Thread splashThread = new Thread() {
			public void run() {
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					finish();
					Intent in = new Intent(getApplicationContext(),
							MainActivity.class);
					startActivity(in);
				}
			}
		};
		splashThread.start();
	}
}