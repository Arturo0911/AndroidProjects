package com.example.carcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.carcompany.process.Credential;
import com.example.carcompany.process.Vehicle;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout carPlate;
    private TextInputLayout carColor;
    private TextInputLayout carMake;
    private TextInputLayout carModel;
    private TextInputLayout carYear;
    private TextInputLayout ownerName;
    private TextInputLayout ownerCredentials;
    private TextInputLayout ownerLastname;

    // initializing such constant
    private static final Vehicle vehicle = new Vehicle();

    public void sendOnclickButton(View view){

        Credential credential = new Credential();

        carPlate = (TextInputLayout) findViewById(R.id.carPlate);
        carColor = (TextInputLayout) findViewById(R.id.carColor);
        carMake = (TextInputLayout) findViewById(R.id.carMake);
        carModel = (TextInputLayout) findViewById(R.id.carModel);
        carYear = (TextInputLayout) findViewById(R.id.carYear);
        ownerName = (TextInputLayout) findViewById(R.id.ownerName);
        ownerLastname = (TextInputLayout) findViewById(R.id.ownerLastname);
        ownerCredentials = (TextInputLayout) findViewById(R.id.ownerCredentials);

        try {

            String plate = carPlate.getEditText().getText().toString();
            String make = carMake.getEditText().getText().toString();
            String model = carModel.getEditText().getText().toString();
            String year = carYear.getEditText().getText().toString();
            String color = carColor.getEditText().getText().toString();
            String owName  = ownerName.getEditText().getText().toString();
            String owLname = ownerLastname.getEditText().getText().toString();
            String owCredential = ownerCredentials.getEditText().getText().toString();

            vehicle.addToArray(plate, make,model,year,color, owName, owLname, owCredential);
            clearFields(carPlate, carMake, carModel,carYear, carColor, ownerName, ownerLastname, ownerCredentials);
            Toast.makeText(MainActivity.this, "The fields was be saved successfully", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(MainActivity.this, "Error by: " +e.toString(), Toast.LENGTH_LONG).show();
        }


    }

    public void viewOnclickButton(View view){

        Intent intent = new Intent(MainActivity.this,ListCarProperties.class);
        try {
            if(Vehicle.vehicleList.size() > 0){
                startActivity(intent);
            }else{
                Toast.makeText(MainActivity.this, "cannot view the data because is already empty", Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(MainActivity.this, "Error by: "+ e.toString(), Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearFields(TextInputLayout carPlate, TextInputLayout carMake, TextInputLayout carModel,
                            TextInputLayout carYear, TextInputLayout carColor, TextInputLayout ownerName,
                            TextInputLayout ownerLastname, TextInputLayout ownerCredentials){

        carPlate.getEditText().setText("");
        carMake.getEditText().setText("");
        carModel.getEditText().setText("");
        carColor.getEditText().setText("");
        carYear.getEditText().setText("");
        ownerName.getEditText().setText("");
        ownerLastname.getEditText().setText("");
        ownerCredentials.getEditText().setText("");


    }
}