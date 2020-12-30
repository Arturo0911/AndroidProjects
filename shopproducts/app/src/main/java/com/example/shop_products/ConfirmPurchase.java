package com.example.shop_products;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shop_products.IndexTemplate;

public class ConfirmPurchase extends AppCompatActivity {

    TextView textNameView;
    TextView idTextValue;
    TextView colorVehicle;
    ActionBar actionBar;

    public void cancelActivity(View view){

        try {
            Intent intent = new Intent(ConfirmPurchase.this, IndexTemplate.class);
            startActivity(intent);
        }catch (Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void confirmPurchase(View view){
        generateDialog();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_purchase);

        Spinner spinner = findViewById(R.id.paymentMethods);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.paymentMethods, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        actionBar  = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#273036")));
        actionBar.setTitle("CAR SHOP");

        textNameView = (TextView)findViewById(R.id.textNameView);
        idTextValue = (TextView) findViewById(R.id.idTextValue);
        colorVehicle = (TextView) findViewById(R.id.colorVehicle);


        textNameView.setText(GlobalsVariablesToShop.nameValueText);
        idTextValue.setText(GlobalsVariablesToShop.idvalueText);
        colorVehicle.setText(GlobalsVariablesToShop.carColor);
    }

    private void generateDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(ConfirmPurchase.this);
        builder.setTitle("Alert");
        builder.setMessage("confirm the purchase?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(ConfirmPurchase.this, finishActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                })
                .setCancelable(false)
                .show();
    }
}