package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String UN = "sidvsai";
    String PW = "SidVSai@123";
    int checkTrials = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void check(View view) {
        TextView un = findViewById(R.id.userName);
        String username = un.getText().toString();

        TextView pw = findViewById(R.id.password);
        String password = pw.getText().toString();

        if (password.equals(PW) && checkTrials<=3) {
            Toast.makeText(this, "Correct password!!", Toast.LENGTH_SHORT).show();
        }

        else if(checkTrials>3) {
            Toast.makeText(this, "Too many failed attempts!!", Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(this, "Password incorrect! Attempts: "+Integer.toString(checkTrials), Toast.LENGTH_SHORT).show();
            checkTrials+=1;
        }
    }
}