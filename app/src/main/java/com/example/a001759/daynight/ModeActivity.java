package com.example.a001759.daynight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.widget.TextView;

public class ModeActivity extends AppCompatActivity {

    TextView modeType;
    int MT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto);
        modeType = findViewById(R.id.txtModeType);
        MT = AppCompatDelegate.getDefaultNightMode();

        if (MT == AppCompatDelegate.MODE_NIGHT_AUTO) {
            modeType.setText("Default Mode: Auto");
        } else if (MT == AppCompatDelegate.MODE_NIGHT_YES) {
            modeType.setText("Default Mode: Night");
        } else if (MT == AppCompatDelegate.MODE_NIGHT_NO) {
            modeType.setText("Default Mode: Day");
        }
    }
}