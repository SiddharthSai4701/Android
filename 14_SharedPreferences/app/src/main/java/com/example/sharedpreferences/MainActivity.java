package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_status);
        Button button_write = findViewById(R.id.btn_write);
        Button button_read = findViewById(R.id.btn_read);
        EditText editTextName = findViewById(R.id.studentName);
        EditText editTextRNo = findViewById(R.id.studentRegNo);
        EditText editTextDOB = findViewById(R.id.studentDOB);

        button_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("SharedPref_Name", MODE_PRIVATE);
                // Editor is used to write to the shared preference
                String studentName = editTextName.getText().toString();
                String regNo = editTextRNo.getText().toString();
                String DOB = editTextDOB.getText().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", studentName);
                editor.putString("registration_no",regNo);
                editor.putString("dob", DOB);
                editor.apply();

                textView.setText("Data Written Successfully!");

            }
        });

        button_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("SharedPref_Name", MODE_PRIVATE);
                String studentName, regNo, DOB;
                // The string should be blank. If accessing an integer, we pass 0
                studentName = sharedPreferences.getString("username", "");
                regNo = sharedPreferences.getString("registration_no","");
                DOB = sharedPreferences.getString("dob", "");
                textView.setText("Username: " + studentName + "\nRegistartion Number: " + regNo + "\nDate of birth: " + DOB);
            }
        });
    }
}