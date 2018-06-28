package com.example.a001759.daynight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btnDay, btnAuto, btnNight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //Setting Night mode as default
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

//       //Setting Day Mode as default.
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        //Setting Auto Mode as default.
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        btnAuto = findViewById(R.id.buttonAuto);
        btnDay = findViewById(R.id.buttonDay);
        btnNight = findViewById(R.id.buttonNight);

        btnAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set Auto
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO);
                Intent autoMode = new Intent(MainActivity.this, ModeActivity.class);
                startActivity(autoMode);
            }
        });

        btnDay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Set Day Mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                Intent dayMode = new Intent(MainActivity.this, ModeActivity.class);
                startActivity(dayMode);

            }
        });

        btnNight.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                //Set Night Mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                Intent nightMode = new Intent(MainActivity.this, ModeActivity.class);
                startActivity(nightMode);
            }
        });
        }
}
