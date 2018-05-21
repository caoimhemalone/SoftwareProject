package com.example.caoimhemalone.amazonaws.softwareproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class Login extends AppCompatActivity {
    private Button RegBTN, Log1BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_content);


        Log1BTN = (Button) findViewById(R.id.Login2);
        Log1BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), Login2.class);
                startActivity(i);
                finish();
            }
        });



        RegBTN = (Button) findViewById(R.id.SignUp);
       RegBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), Register.class);
                startActivity(i);
                finish();
            }
        });


    }
}
