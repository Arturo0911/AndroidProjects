package com.example.cardio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.forms.*;
import com.example.routes.Routes;

import java.util.*;
import java.util.concurrent.TimeUnit;

import pl.droidsonroids.gif.GifAnimationMetaData;

public class CardioRegister extends AppCompatActivity {

    //private Button initButoon;
    private EditText nameText;
    //private  VideoView loadingVideo;
    //private GifAnimationMetaData gifLoading ;

    private LinearLayout linearLayouLoadingGift;


    public void initProcess(View view){



        try {
            linearLayouLoadingGift = (LinearLayout) findViewById(R.id.linearLayouLoadingGift);
            linearLayouLoadingGift.setVisibility(view.VISIBLE);

            TimeUnit.SECONDS.sleep(2);
            Toast.makeText(CardioRegister.this, "Process initialazing", Toast.LENGTH_SHORT).show();


            Intent intent = new Intent(this, Routes.class);
            startActivity(intent);
        }catch (Exception e){
            Toast.makeText(this,"Erro by: "+e.toString(), Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio_register);
        //VideoView loadingVideo = (VideoView) findViewById(R.id.loadingGif);

    }
}