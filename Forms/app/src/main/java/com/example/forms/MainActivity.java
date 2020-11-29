package com.example.forms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.routes.Routes;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;




    public void greetingInitial(View view){
        try {

            userName = (EditText) findViewById(R.id.userName);
            password = (EditText) findViewById(R.id.userPass);


            if (!userName.getText().equals("") && !password.getText().equals("")){
                Toast.makeText(this, "your user name is: "+userName.getText()+" and your pass is: "+password.getText(),
                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Routes.class);
                startActivity(intent);
            }

        }catch (Exception e ){
            Toast.makeText(this,"error by: "+e.toString(), Toast.LENGTH_SHORT ).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}