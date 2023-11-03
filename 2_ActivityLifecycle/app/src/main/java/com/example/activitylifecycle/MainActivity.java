package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity Lifecycle", "onCreate invoked");
        Toast.makeText(this, "Created", Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.txt);
        tv.setText("Created");
    }

    @Override
    protected void onStart() {

        super.onStart();
        Log.d("Activity Lifecycle", "onStarted");
        Toast.makeText(this, "Started", Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.txt);
        tv.setText("Started");
    }

    @Override
    protected void onResume() {

        super.onResume();
        Log.d("Activity Lifecycle", "onResume invoked");
        Toast.makeText(this, "Resumed", Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.txt);
        tv.setText("Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Lifecycle", "onPause invoked");
        Toast.makeText(this, "Paused", Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.txt);
        tv.setText("Paused");
    }

    @Override
    protected void onStop() {

        super.onStop();
        Log.d("Activity Lifecycle", "onStop invoked");
        Toast.makeText(this, "Stopped", Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.txt);
        tv.setText("Stopped");
    }

    @Override
    protected void onRestart() {

        super.onRestart();
        Log.d("Activity Lifecycle", "onRestart invoked");
        Toast.makeText(this, "Restarted", Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.txt);
        tv.setText("Restarted");
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
        Log.d("Activity Lifecycle", "onDestroy invoked");
        Toast.makeText(this, "Destroyed", Toast.LENGTH_SHORT).show();
        TextView tv = findViewById(R.id.txt);
        tv.setText("Destroyed");
    }



}