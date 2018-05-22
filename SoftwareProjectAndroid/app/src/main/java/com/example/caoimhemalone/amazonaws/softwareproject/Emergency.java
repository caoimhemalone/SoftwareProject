package com.example.caoimhemalone.amazonaws.softwareproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;



/**
 * Created by caoimhemalone on 26/03/2018.
 */

public class Emergency extends AppCompatActivity {
    private Button HButton,CButton, EButton, SButton, cameraBtn;
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

        cameraBtn = (Button) findViewById(R.id.camAccess);
        cameraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), Livestream.class);
                startActivity(i);
                finish();
            }
        });


        findViewById(R.id.nineoneone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("999");
            }
        });

        findViewById(R.id.alertContacts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String messageToSend = "This is an EMERGENCY alert from Safe and Sound";
                String number = "+353833144230";

                SmsManager.getDefault().sendTextMessage(number, null, messageToSend, null, null);            }
        });
    }

        private void dialContactPhone(final String phoneNumber) {
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
        }


}
