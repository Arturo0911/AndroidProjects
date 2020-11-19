package com.example.pruebasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){
        Log log = null;
        log.i("Info", "Image view has been taped");
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        // el parámetro alpha es utilizado para jugar con la solidifquez del elemento, por así decirlo
        // Los parámetros de setDuration son en milisegundos, por lo que 2000 equivalen a 2 segundos.
        imageView.animate().alpha(0).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}