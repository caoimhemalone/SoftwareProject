package com.example.caoimhemalone.amazonaws.softwareproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class NewContact extends AppCompatActivity {



    /**
     * Created by caoimhemalone on 26/03/2018.
     */


    private Button HButton,CButton, EButton, SButton;
    private Button AddContBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newcontact_content);

        HButton = (Button) findViewById(R.id.HomeButton);
        HButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        CButton = (Button) findViewById(R.id.ContactsButton);
        CButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), Contacts.class);
                startActivity(i);
                finish();
            }
        });

        EButton = (Button) findViewById(R.id.EmergencyButton);
        EButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), Emergency.class);
                startActivity(i);
                finish();
            }
        });

        SButton = (Button) findViewById(R.id.SettingsButton);
        SButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), com.example.caoimhemalone.amazonaws.softwareproject.Settings.class);
                startActivity(i);
                finish();
            }
        });

        AddContBTN = (Button) findViewById(R.id.addContBtn);
        AddContBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), com.example.caoimhemalone.amazonaws.softwareproject.Contacts.class);
                startActivity(i);
                finish();
            }
        });




    }


}
