package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button implicit_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        implicit_btn = findViewById(R.id.implicitIntent);

        implicit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://milestone-monitor.vercel.app/"));
                startActivity(intent);
            }
        });
    }

    public void explicitClicked(View view) {
        Intent intent = new Intent(getBaseContext(), MainActivity2.class);
        startActivity(intent);
    }
}