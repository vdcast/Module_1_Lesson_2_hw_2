package com.example.modul_1_zaniatie_2_dom_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int temperature = 29;

        if (temperature < 18){
            Log.d("MYLOG", "Too cold. A/C turned ON.");
        } else if (temperature > 28){
            Log.d("MYLOG", "Too hot. A/C turned OFF.");
        } else {
            Log.d("MYLOG", "Comfort temperature.");
        }

    }
}