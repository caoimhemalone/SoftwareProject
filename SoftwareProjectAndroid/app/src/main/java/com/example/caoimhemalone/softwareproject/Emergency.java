package com.example.caoimhemalone.softwareproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by caoimhemalone on 26/03/2018.
 */

public class Emergency extends AppCompatActivity {
    private Button HButton,CButton, EButton, SButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_content);

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
                i = new Intent(getApplicationContext(), Settings.class);
                startActivity(i);
                finish();
            }
        });

    }
}
