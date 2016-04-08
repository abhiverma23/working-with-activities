package com.etechclub.working_with_activities;

import android.app.Activity;
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

    String classes[] = { "Menu", "SubActivity1", "SubActivity2",
            "SubActivity3", "SubActivity4", "SubActivity5"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        lv = (ListView) findViewById(R.id.lv);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "" + position ,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}