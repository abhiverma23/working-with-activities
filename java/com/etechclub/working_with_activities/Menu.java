package com.etechclub.working_with_activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

// STOPSHIP: 08-Apr-16
/*
 * Created by Dont Know on 08-Apr-16.
 */
public class Menu extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Thread timer = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        timer.start();
        Intent intent= new Intent("com.etechclub.working_with_activities.SUBACTIVITY");
        startActivity(intent);

    }
}
