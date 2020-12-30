package com.example.shop_products;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;
import com.example.shop_products.GlobalsVariablesToShop;

public class IndexTemplate extends AppCompatActivity {

    EditText nameText;
    EditText idText;
    ActionBar actionBar;


    public void initActivity(View view){
        nameText = (EditText) findViewById(R.id.nameText);
        idText = (EditText) findViewById(R.id.idText);
        Intent intent = new Intent(this, MainActivity.class);

        GlobalsVariablesToShop.nameValueText = nameText.getText().toString();
        GlobalsVariablesToShop.idvalueText = idText.getText().toString();

        try {

            if (!nameText.getText().toString().equals("") && !idText.getText().toString().equals("")){
                //TimeUnit.SECONDS.sleep(2);
                startActivity(intent);
            }else{
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_LONG).show();
            }

        }catch (Exception e){
            Toast.makeText(this, "Error by: "+e.toString(), Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_template);
        actionBar  = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#273036")));
        actionBar.setTitle("CAR SHOP");
    }
}