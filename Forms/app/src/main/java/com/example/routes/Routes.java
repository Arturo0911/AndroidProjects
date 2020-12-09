package com.example.routes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.forms.R;

public class Routes extends AppCompatActivity {


    public void onGreeting(View view){
        Toast.makeText(Routes.this, "hola chicos, espero podamos pasar todas las materias xD", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routes);
    }
}