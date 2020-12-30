package com.example.shop_products;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActionBar actionBar;

    public void generatePurchase (View view){
        Toast.makeText(this, "Purchase generated", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar  = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#273036")));
        actionBar.setTitle("CAR SHOP");



        RadioButton black = (RadioButton) findViewById(R.id.radioBlackButton);
        RadioButton blue = (RadioButton) findViewById(R.id.radioBlueButton);
        RadioButton silver = (RadioButton) findViewById(R.id.radioSilverButton);
        RadioButton red = (RadioButton) findViewById(R.id.radioRedButton);

        black.setOnClickListener(this);
        blue.setOnClickListener(this);
        silver.setOnClickListener(this);
        red.setOnClickListener(this);

        /*black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carView.setImageResource(R.drawable.beat_black);

            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carView.setImageResource(R.drawable.beat_blue);

            }
        });

        silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carView.setImageResource(R.drawable.beat_gray);

            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carView.setImageResource(R.drawable.beat_red);

            }
        });*/

    }

    @Override
    public void onClick(View v) {
        ImageView carView = (ImageView) findViewById(R.id.carView);
        switch (v.getId()){
            case R.id.radioBlackButton:

                carView.setImageResource(R.drawable.beat_black);
                break;
            case R.id.radioBlueButton:

                carView.setImageResource(R.drawable.beat_blue);
                break;
            case R.id.radioSilverButton:

                carView.setImageResource(R.drawable.beat_gray);
                break;
            case R.id.radioRedButton:

                carView.setImageResource(R.drawable.beat_red);
                break;

        }
    }
}