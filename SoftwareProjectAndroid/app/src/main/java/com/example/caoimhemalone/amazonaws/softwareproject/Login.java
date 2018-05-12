package com.example.caoimhemalone.amazonaws.softwareproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class Login extends AppCompatActivity {
    private Button HBTN, RegBTN, LogBTN, LogAma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_content);

//        HBTN = (Button) findViewById(R.id.homeLogBTN);
//        HBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i;
//                i = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });


        LogBTN = (Button) findViewById(R.id.Login);
        LogBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), Login2.class);
                startActivity(i);
                finish();
            }
        });

//        LogAma = (Button) findViewById(R.id.LoginAM);
//        LogAma.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i;
//                i = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });

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
