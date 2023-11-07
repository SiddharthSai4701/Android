package com.example.customopeningscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.ProgressBar;


public class SplashActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int progress = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        progressBar = findViewById(R.id.progBar);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                int prog=0;
                for(int i=0;i<10;i++)
                {
                    progressBar.setProgress(prog+50);
                    progressBar.incrementProgressBy(50);
                    SystemClock.sleep(500);
                }
                finish();
            }
        }, 3000);


    }
}