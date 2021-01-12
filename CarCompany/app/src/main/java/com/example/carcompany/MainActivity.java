package com.example.carcompany;

import androidx.appcompat.app.AppCompatActivity;

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

        /*
         * @param carPlate
         * @param carMake
         * @param carModel
         * @param carYear
         * @param carColor
         * @param ownerName
         * @param ownerCredentials
         * @param ownerLastname
         * */

        try {
            vehicle.addToArray(carPlate.getEditText().toString(), carMake.getEditText().toString(),
                    carModel.getEditText().toString(),carYear.getEditText().toString(),
                    carColor.getEditText().toString(),ownerName.getEditText().toString(),
                    ownerLastname.getEditText().toString(),ownerCredentials.getEditText().toString());
            clearFields(carPlate, carMake, carModel,carYear, carColor, ownerName, ownerLastname, ownerCredentials);
            Toast.makeText(MainActivity.this, "The fields was be saved successfully", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(MainActivity.this, "Error by: " +e.toString(), Toast.LENGTH_LONG).show();
        }



        /*//wnerCredentials = (TextInputLayout) findViewById(R.id.ownerCredentials);
        /*int counter = 0;
        String [] names = name.split("");

        if (credential.checkCredential("0918237421")){
            Toast.makeText(MainActivity.this, "credentials: "+ownerCredentials.getEditText().getText().toString()+" are correct!!", Toast.LENGTH_SHORT).show();
        }else{
            try {
                Toast.makeText(MainActivity.this, "Wrong credentials "+names[0], Toast.LENGTH_SHORT).show();
            }catch (Exception e){
                e.printStackTrace();
                Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
            }
        }

        try {

            if (credential.checkCredential(name)){
                Toast.makeText(MainActivity.this, "credentials: "+ownerCredentials.getEditText().getText().toString()+" are correct!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "Wrong credentials "+ownerCredentials.getEditText().getText().toString(), Toast.LENGTH_SHORT).show();
            }

        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(MainActivity.this, "Error by: "+e.toString(), Toast.LENGTH_SHORT).show();
        }*/



    }

    public void viewOnclickButton(View view){
        Toast.makeText(MainActivity.this, "viewing data", Toast.LENGTH_SHORT).show();
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