package com.example.shop_products;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    RadioButton black;
    RadioButton blue;
    RadioButton silver;
    RadioButton red;


    public void generatePurchase (View view){

        Intent intentPurchase = new Intent(this, ConfirmPurchase.class);

        if (!black.isChecked() && !blue.isChecked() && !silver.isChecked() && !red.isChecked()){
            Toast.makeText(this, "You must to check almost one color", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Purchase generated", Toast.LENGTH_SHORT).show();
            startActivity(intentPurchase);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar  = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#273036")));
        actionBar.setTitle("CAR SHOP");



        black = (RadioButton) findViewById(R.id.radioBlackButton);
        blue = (RadioButton) findViewById(R.id.radioBlueButton);
        silver = (RadioButton) findViewById(R.id.radioSilverButton);
        red = (RadioButton) findViewById(R.id.radioRedButton);

        black.setOnClickListener(this);
        blue.setOnClickListener(this);
        silver.setOnClickListener(this);
        red.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        ImageView carView = (ImageView) findViewById(R.id.carView);
        switch (v.getId()){
            case R.id.radioBlackButton:

                carView.setImageResource(R.drawable.beat_black);
                GlobalsVariablesToShop.carColor = "Black";
                break;
            case R.id.radioBlueButton:

                carView.setImageResource(R.drawable.beat_blue);
                GlobalsVariablesToShop.carColor = "Blue";
                break;
            case R.id.radioSilverButton:

                carView.setImageResource(R.drawable.beat_gray);
                GlobalsVariablesToShop.carColor = "Silver";
                break;
            case R.id.radioRedButton:

                carView.setImageResource(R.drawable.beat_red);
                GlobalsVariablesToShop.carColor = "Red";
                break;
        }
    }
}