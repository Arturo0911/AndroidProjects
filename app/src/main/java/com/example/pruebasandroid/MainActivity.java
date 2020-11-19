package com.example.pruebasandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartShowing = true;

    public void fade(View view){
        /*log envia mensajes por consola*/
        Log log = null;
        log.i("Info", "Image view has been taped");
        // find by view is similar to docuemnt.getElementById xD
        ImageView bartimageView = (ImageView) findViewById(R.id.bartimageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerimageView);
        //ImageView leslieImageView = (ImageView) findViewById(R.id.leslieimageView);

        /*
        * el parámetro alpha es utilizado para jugar con la solidifquez del elemento, por así decirlo
        * Los parámetros de setDuration son en milisegundos, por lo que 2000 equivalen a 2 segundos.
         */

        /*
        * ahora creamos una conficional de que si la imagen de Bart se muestra
        * entonces ocúltala, caso contrario escóndea, viceversa para Homero
        * */

        /*
        * La fuincion animate().translationYBy() acepta valores positivos y negativos para mover
        * la imagen o devolverla también la función translationXBy
        * */

        /*
        * rotation() funcion que también viene con animate() y también se le puede colocar el tiempo de duración
        * los valores que acepta son valores en grados, la cantidad de grados que quieras que una imagen de una vuelta.
        * */

        if (bartShowing){

            bartShowing = false;

            //bartimageView.animate().alpha(0).setDuration(2000);
            //homerImageView.animate().alpha(1).setDuration(2000);
            //bartimageView.animate().rotation(360).setDuration(3000);
            bartimageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
            //leslieImageView.animate().alpha(1).setDuration(10000);
            /*bartimageView.animate().translationYBy(1000).setDuration(2000);
            homerImageView.animate().translationXBy(-1000).setDuration(2000);*/
        } else{

            bartShowing = true;
            bartimageView.animate().scaleX(1).scaleY(1).setDuration(1000);

            //bartimageView.animate().alpha(1).setDuration(2000);
            //homerImageView.animate().alpha(0).setDuration(2000);
            /*bartimageView.animate().translationYBy(-1000).setDuration(2000);
            homerImageView.animate().translationXBy(1000).setDuration(2000);*/
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        * Seteamos la posicion setX en -1000
        * para que el efecto al momento de abrir el emulador de Android, este
        * tenga un efecto de spinner
        * */
        ImageView bart = (ImageView) findViewById(R.id.bartimageView);
        bart.setX(-1000);
        bart.animate().translationXBy(1000).rotation(3600).setDuration(3000);



    }
}