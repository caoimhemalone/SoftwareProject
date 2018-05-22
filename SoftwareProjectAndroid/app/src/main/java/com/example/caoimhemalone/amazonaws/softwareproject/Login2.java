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


public class Login2 extends AppCompatActivity {
    private Button HBTN;
    private Button LogBtn;

    private EditText txtEmailLogin;
    private EditText txtPasswordLogin;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2_content);

        txtEmailLogin = (EditText) findViewById(R.id.logEmailET);
        txtPasswordLogin = (EditText) findViewById(R.id.logPwordET);
        firebaseAuth = FirebaseAuth.getInstance();




        HBTN = (Button) findViewById(R.id.homeLogBTN);
        HBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });
//
//        LogBTN = (Button) findViewById(R.id.Login);
//        LogBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i;
//                i = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });

        LogBtn =  findViewById(R.id.Login2);
        LogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ProgressDialog progressDialog = ProgressDialog.show(Login2.this, "Please Wait...", "Processing", true);

                (firebaseAuth.signInWithEmailAndPassword(txtEmailLogin.getText().toString(), txtPasswordLogin.getText().toString()))
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressDialog.dismiss();

                                if (task.isSuccessful()){
                                    Toast.makeText(Login2.this, "Login Successful", Toast.LENGTH_LONG).show();
                                    Intent i = new Intent(Login2.this, MainActivity.class);
                                    i.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                                    startActivity(i);

                                }
                                else {
                                    Log.e("Error",task.getException().toString());
                                    Toast.makeText(Login2.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });
    }

//    public void LoginBtnClick(View v){
//        final ProgressDialog progressDialog = ProgressDialog.show(Login2.this, "Please Wait...", "Processing", true);
//
//        (firebaseAuth.signInWithEmailAndPassword(txtEmailLogin.getText().toString(), txtPasswordLogin.getText().toString()))
//                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        progressDialog.dismiss();
//
//                        if (task.isSuccessful()){
//                            Toast.makeText(Login2.this, "Login Successful", Toast.LENGTH_LONG).show();
//                            Intent i = new Intent(Login2.this, MainActivity.class);
//                            i.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
//                            startActivity(i);
//
//                        }
//                        else {
//                            Log.e("Error",task.getException().toString());
//                            Toast.makeText(Login2.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
//                        }
//                    }
//                });
//
//    }
}
