package com.miuidev.updater;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MIUIDevUpdaterActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab);

        /** TabHost will have Tabs */
        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        /** TabSpec used to create a new tab.
         * By using TabSpec only we are able to setContent to the tab.
         * By using TabSpec setIndicator() we can set name of the tab. */

        /** tid1 is systemUpdateTabSpec Id. Its used to access outside. */
        TabSpec systemUpdateTabSpec = tabHost.newTabSpec("tid1");
        TabSpec themeUpdateTabSpec = tabHost.newTabSpec("tid1");

        /** TabSpec setIndicator() is used to set name for the tab. */
        /** TabSpec setContent() is used to set content for a particular tab. */
        systemUpdateTabSpec.setIndicator("System Update").setContent(new Intent(this,SystemUpdateActivity.class));
        themeUpdateTabSpec.setIndicator("Themes").setContent(new Intent(this,ThemeUpdateActivity.class));

        /** Add tabSpec to the TabHost to display. */
        tabHost.addTab(systemUpdateTabSpec);
        tabHost.addTab(themeUpdateTabSpec);

    }
}
