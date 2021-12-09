package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton b1,b2;
    EditText e1,e2;
    String getUsername,getPassword;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(AppCompatButton)findViewById(R.id.button1) ;
        b2=(AppCompatButton)findViewById(R.id.button2);
        e1=(EditText)findViewById(R.id.username);
        e2=(EditText)findViewById(R.id.password);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getUsername=e1.getText().toString();
                getPassword=e2.getText().toString();




            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });




    }
}