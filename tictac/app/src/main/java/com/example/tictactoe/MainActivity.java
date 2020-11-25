package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void dropIn(View view){

        /*
        * set the value of the image without png image
        * */
        ImageView counter = (ImageView) view;
        /*
        * Now  set the position relative by Y
        * search in drawable folder to found yellow image and set
        * after that set animates like TranslationY by her original value 1500 and add rotation and setDuration
        * */

        counter.setTranslationY(-1500);
        counter.setImageResource(R.drawable.yellow);
        counter.animate().translationYBy(1500).setDuration(2000);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}