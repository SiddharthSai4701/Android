package com.example.menus;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.item2) {
            Toast.makeText(this, "Physical Sc", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.item3) {
            Toast.makeText(this, "IT", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.item4) {
            Toast.makeText(this, "Life Sc", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.ph_subitem1) {
            Toast.makeText(this, "Physics", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.subitem1) {
            Toast.makeText(this, "CSc", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.subitem2) {
            Toast.makeText(this, "BDA", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.ls_subitem1) {
            Toast.makeText(this, "EVS", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
