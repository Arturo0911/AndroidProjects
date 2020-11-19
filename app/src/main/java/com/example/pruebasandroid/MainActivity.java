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
        // find by view is similar to docuemnt.getElementById xD
        ImageView bartimageView = (ImageView) findViewById(R.id.bartimageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerimageView);

        // el parámetro alpha es utilizado para jugar con la solidifquez del elemento, por así decirlo
        // Los parámetros de setDuration son en milisegundos, por lo que 2000 equivalen a 2 segundos.
        bartimageView.animate().alpha(0).setDuration(2000);
        homerImageView.animate().alpha(1).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}