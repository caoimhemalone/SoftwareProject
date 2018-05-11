package com.example.caoimhemalone.amazonaws.softwareproject;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Register extends AppCompatActivity {
    private FloatingActionButton addBTN;
    private EditText txtEmailReg;
    private EditText txtPasswordReg;
    private EditText txtConfirmPasswordReg;
    private EditText txtNumberReg;
    private EditText txtNameReg;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_content);
        txtEmailReg = findViewById(R.id.auEmailET);
        txtPasswordReg = findViewById(R.id.auPwordET);
        //txtConfirmPasswordReg = findViewById(R.id.auConPwordET);
        txtNumberReg = findViewById(R.id.auNumET);
        txtNameReg = findViewById(R.id.auNameET);
        firebaseAuth = FirebaseAuth.getInstance();

//        addBTN = (FloatingActionButton) findViewById(R.id.addUserBTN);
//        addBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i;
//                i = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
    }

    public void registerBtnClick (View v){
        final ProgressDialog progressDialog = ProgressDialog.show(Register.this, "Please wait...", "Processing...", true );
        (firebaseAuth.createUserWithEmailAndPassword(txtEmailReg.getText().toString(), txtPasswordReg.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if (task.isSuccessful()) {
                            Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(Register.this, Login2.class);
                            startActivity(i);
                        }
                        else {
                            Log.e("Error", task.getException().toString());
                            Toast.makeText(Register.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();

                        }
                    }
                });


    }
}
