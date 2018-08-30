package com.example.armin.educativasim;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class begin_activity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT= 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin_activity);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, SPLASH_TIME_OUT);
        //        android:theme="@style/AppTheme" para el header

    }
}
