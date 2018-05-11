package com.example.caoimhemalone.amazonaws.softwareproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


/**
 * Created by caoimhemalone on 26/03/2018.
 */

public class Settings extends AppCompatActivity {
    private Button HButton,CButton, EButton, SButton, guidelines, Logout;

    //Firebase
    private FirebaseAuth mAuth;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_content);


        //Top bar
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

        guidelines = (Button) findViewById(R.id.guidlinesBTN);
        guidelines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), Guidelines.class);
                startActivity(i);
                finish();
            }
        });

        Logout = (Button) findViewById(R.id.logout);
        Logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(Settings.this, "Logout Successful", Toast.LENGTH_LONG).show();
                sendToStart();
            }
        });

        mAuth = FirebaseAuth.getInstance();

    }

    //Firebase

//    private void setupFirebaseListener(){
//        Log.d(TAG, "setupFirebaseLister: setting up the auth state listener");
//        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//                if (user != null){
//                    Log.d(TAG, "onAuthStateChanged: signed_in: "+ user.getEmail());
//                }
//                else {
//                    Log.d(TAG, "onAuthStateChanged: signed_on");
//                    Toast.makeText(getActivity(),)
//                }
//            }
//        };
//    }
    @Override
    public void onStart(){
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if(currentUser == null){
            sendToStart();
        }
    }

    private void sendToStart(){
        Intent startIntent = new Intent(Settings.this, Login.class);
        startActivity(startIntent);
        finish();
    }

//    @Override
//    public void onStop(){
//        super.onStop();
//        if(mAuthStateListener != null){
//            FirebaseAuth.getInstance().removeAuthStateListener(mAuthStateListener);
//        }
//    }
}
