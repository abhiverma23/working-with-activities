package com.etechclub.working_with_activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SubActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        Toast.makeText(getApplicationContext(),"Hello To This New World!",Toast.LENGTH_LONG).show();

    }
}
