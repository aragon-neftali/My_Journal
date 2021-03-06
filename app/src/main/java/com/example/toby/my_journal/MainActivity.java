package com.example.toby.my_journal;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:      //stay in Home screen
                    break;

                case R.id.navigation_entry:     //switch to New_Entry screen
                    Intent intent0 = new Intent(MainActivity.this, New_Entry.class);
                    startActivity(intent0);
                    break;

                case R.id.navigation_calendar:  //switch to Calendar screen
                    Intent intent1 = new Intent(MainActivity.this, Calendar.class);
                    startActivity(intent1);
                    break;

                case R.id.navigation_maps:      //switch to Maps screen
                    Intent intent2 = new Intent(MainActivity.this, Maps.class);
                    startActivity(intent2);
                    break;
            }
            return false;
        }
    };



}
