package com.example.cardio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.forms.*;
import com.example.routes.Routes;

public class CardioRegister extends AppCompatActivity {

    //private Button initButoon;
    private EditText nameText;


    public void initProcess(View view){

        Toast.makeText(CardioRegister.this, "Process initialazing", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Routes.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_register);
    }
}