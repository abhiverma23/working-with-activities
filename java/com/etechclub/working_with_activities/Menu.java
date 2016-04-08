package com.etechclub.working_with_activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

// STOPSHIP: 08-Apr-16
/*
 * Created by Dont Know on 08-Apr-16.
 */
public class Menu extends Activity {

    String classes[] = { "SUBACTIVITY1", "SUBACTIVITY2",
            "SUBACTIVITY3", "SUBACTIVITY4", "SUBACTIVITY5"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        lv = (ListView) findViewById(R.id.lv);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "" + lv.getItemAtPosition(position) ,
                        Toast.LENGTH_SHORT).show();

                Intent intent =
                        new Intent("com.etechclub.working_with_activities." +
                                classes[position] );
                startActivity(intent);
            }
        });
    }
}