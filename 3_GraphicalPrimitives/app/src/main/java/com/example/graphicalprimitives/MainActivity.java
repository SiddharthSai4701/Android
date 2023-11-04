package com.example.graphicalprimitives;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Bitmap bg;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating bitmap
        bg = Bitmap.createBitmap(720, 1280, Bitmap.Config.RGB_565);
        img = findViewById(R.id.imageView);
        img.setImageBitmap(bg);

        // Creating canvas object
        Canvas canvas = new Canvas(bg);

        // Creating paint object and setting color and text size
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setTextSize(50);

        // To draw a rectangle
        canvas.drawText("Rectangle", 420, 150, paint);
        canvas.drawRect(400, 200, 650, 700, paint);

        // To draw a circle
        paint.setColor(Color.BLUE);
        canvas.drawText("Circle", 120, 150, paint);
        canvas.drawCircle(200, 350,150,paint);

        paint.setColor(Color.parseColor("Yellow"));
        canvas.drawText("Square", 120,800, paint);
        canvas.drawRect(50, 850, 350, 1150, paint);

        // To draw a line
        paint.setColor(Color.parseColor("Magenta"));
        canvas.drawText("Line", 480, 800, paint);
        canvas.drawLine(520, 850, 520, 1150, paint);


    }
}