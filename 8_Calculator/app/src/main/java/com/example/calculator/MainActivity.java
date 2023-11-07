package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add, sub, mul, div;
    EditText num1, num2;
    TextView ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);

        ans = findViewById(R.id.ans);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float sum = n1 + n2;

                ans.setText("Answer: " + sum);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float diff = n1 - n2;

                ans.setText("Answer: " + diff);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float prod = n1 * n2;

                ans.setText("Answer: " + prod);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float quo = n1 / n2;

                ans.setText("Answer: " + quo);

            }
        });
    }
}