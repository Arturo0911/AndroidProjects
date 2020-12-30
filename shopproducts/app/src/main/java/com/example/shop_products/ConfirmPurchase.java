package com.example.shop_products;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

import com.example.shop_products.IndexTemplate;

public class ConfirmPurchase extends AppCompatActivity {

    TextView textNameView;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_purchase);
        actionBar  = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#273036")));
        actionBar.setTitle("CAR SHOP");

        textNameView = (TextView)findViewById(R.id.textNameView);
        textNameView.setText(GlobalsVariablesToShop.nameValueText);
    }
}