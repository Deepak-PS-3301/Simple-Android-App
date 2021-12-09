package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    AppCompatButton b1,b2;
    String getName,getAddress,getPhno,getEmail,getUsername,getPassword,getCPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText) findViewById(R.id.name);
        e2=(EditText) findViewById(R.id.address);
        e3=(EditText) findViewById(R.id.phno);
        e4=(EditText) findViewById(R.id.emailid);
        e5=(EditText) findViewById(R.id.username);
        e6=(EditText) findViewById(R.id.password);
        e7=(EditText) findViewById(R.id.cpassword);
        b1=(AppCompatButton)findViewById(R.id.regbutton);
        b2=(AppCompatButton)findViewById(R.id.backlogin);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=e1.getText().toString();
                getAddress=e2.getText().toString();
                getPhno=e3.getText().toString();
                getEmail=e4.getText().toString();
                getUsername=e5.getText().toString();
                getPassword=e6.getText().toString();
                getCPassword=e7.getText().toString();
                Toast.makeText(getApplicationContext(), "registration success", Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });






    }
}