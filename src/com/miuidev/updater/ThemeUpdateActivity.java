package com.miuidev.updater;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThemeUpdateActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/* Second Tab Content */
		TextView textView = new TextView(this);
		textView.setText("There are no updates available");
		setContentView(textView);

	}
}
