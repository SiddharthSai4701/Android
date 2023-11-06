package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_status);
        Button button_write = findViewById(R.id.btn_write);
        Button button_read = findViewById(R.id.btn_read);
        EditText editText = findViewById(R.id.editText);

        String username_demo = editText.getText().toString();
//        String email_demo = " test@email.com";
        button_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("SharedPref_Name", MODE_PRIVATE);
                // Editor is used to write to the shared preference
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("username", username_demo);
//                editor.putString("email", email_demo);
                editor.apply();
                textView.setText(" Writing Operation successful! ");
            }
        });

        button_read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences = getSharedPreferences("SharedPref_Name", MODE_PRIVATE);
                String username, email;
                // The string should be blank. If accessing an integer, we pass 0
                username = sharedPreferences.getString("username", "");
//                email = sharedPreferences.getString("email", "");
                textView.setText("Username: " + editText.getText().toString() + "\n");
            }
        });
    }
}