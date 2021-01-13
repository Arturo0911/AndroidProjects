package com.example.carcompany;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carcompany.process.Vehicle;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.Arrays;

public class LastTemplate extends AppCompatActivity{

    private TextView whichService;
    private TextView fullMake;
    private TextView fullModel;
    private TextView fullName;
    private TextView fullCredentials;
    private TextView serviceDescription;
    private TextView fullOrder;

    private MaterialButton deleteOrder;
    private MaterialButton confirmOrder;

    public void onDeleteOrder(View view){
        fullOrder = (TextView) findViewById(R.id.fullOrder);
        int index = Integer.parseInt(fullOrder.getText().toString());
        generateDialogOnDelete(index);
        //Toast.makeText(this, "order number: "+fullOrder.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_template);

        /*
        * intentLastTemplate.putExtra("position", String.valueOf(position));
        * */

        /*ArrayList<ArrayList<String>> matrix = new ArrayList<ArrayList<String>>();

        ArrayList<String> vector_1 = new ArrayList<String>(Arrays.asList("GYE-2526", "Chevrolet",
                "Grand Vitara", "2002", "Black", "Arturo", "Negreiros", "091823721", "Car washing", Vehicle.imageName));

        ArrayList<String> vector_2 = new ArrayList<String>(Arrays.asList("UIO-1515", "Ford",
                "Runner", "2018", "Red", "Francesco", "Samanez", "1234567898", "Car maintenance", Vehicle.imageName));

        ArrayList<String> vector_3 = new ArrayList<String>(Arrays.asList("TOJ-0010", "Mazda",
                "Mazda", "2000", "Silver", "Juan", "Samanez", "1234567898", "Car paint", Vehicle.imageName));

        matrix.add(vector_1);
        matrix.add(vector_2);
        matrix.add(vector_3);*/

        whichService = (TextView)findViewById(R.id.whichService);
        fullMake = (TextView)findViewById(R.id.fullMake);
        fullModel = (TextView)findViewById(R.id.fullModel);
        fullName = (TextView)findViewById(R.id.fullName);
        fullCredentials = (TextView)findViewById(R.id.fullCredentials);
        serviceDescription = (TextView)findViewById(R.id.serviceDescription);
        fullOrder = (TextView) findViewById(R.id.fullOrder);


        Intent lastIntent = getIntent();
        int index = Integer.parseInt(lastIntent.getStringExtra("position"));

        ArrayList<String> valuesAdd = new ArrayList<String>();

        valuesAdd = Vehicle.vehicleList.get(index);

        /*
         * [[plate, make,model,year,color, owName, owLname, owCredential, Vehicle.serviceType, Vehicle.imageName]]
         * */

        fullOrder.setText(String.valueOf(index));
        whichService.setText(valuesAdd.get(8));
        fullMake.setText("Make: "+valuesAdd.get(1));
        fullModel.setText("Model: "+valuesAdd.get(2));
        fullName.setText(valuesAdd.get(5)+" "+valuesAdd.get(6));
        fullCredentials.setText(valuesAdd.get(7));
        serviceDescription.setText("The plate car is "+valuesAdd.get(0)+".With this service you will have the best experience with us");

        /*deleteOrder = (MaterialButton) findViewById(R.id.deleteOrder);
        confirmOrder = (MaterialButton) findViewById(R.id.confirmOrder);

        deleteOrder.setOnClickListener(this);
        confirmOrder.setOnClickListener(this);*/
    }

    /*
     * Called when a view has been clicked.
     *
     * @param  view that was clicked.
     */
    /*@Override
    public void onClick(View v) {

    }*/




    private void generateDialogOnConFirm(){
        AlertDialog.Builder builder = new AlertDialog.Builder(LastTemplate.this);
        builder.setTitle("Alert");
        builder.setMessage("confirm the purchase?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(LastTemplate.this, MainActivity.class);
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

    private void generateDialogOnDelete(int index){
        AlertDialog.Builder builder = new AlertDialog.Builder(LastTemplate.this);
        builder.setTitle("Alert");
        builder.setMessage("Are you sure to delete this order?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "deleting...", Toast.LENGTH_LONG).show();

                        if(Vehicle.vehicleList.size()<=1){
                            Vehicle.vehicleList.remove(index);
                            Intent intent = new Intent(LastTemplate.this, MainActivity.class);
                            startActivity(intent);
                        }else{
                            Vehicle.vehicleList.remove(index);
                            Intent intent = new Intent(LastTemplate.this, ListCarProperties.class);
                            startActivity(intent);
                        }

                    }
                })
                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "ok! No problem", Toast.LENGTH_LONG).show();
                        dialog.dismiss();
                    }
                })
                .setCancelable(false)
                .show();
    }


}