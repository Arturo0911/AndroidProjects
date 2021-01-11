package com.example.carcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void sendOnclickButton(View view){
        Toast.makeText(MainActivity.this, "sending data", Toast.LENGTH_SHORT).show();
    }

    public void viewOnclickButton(View view){
        Toast.makeText(MainActivity.this, "viewing data", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}