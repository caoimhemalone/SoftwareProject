//Ref: for database https://www.youtube.com/watch?v=oyifGv42pWE

package com.example.caoimhemalone.amazonaws.softwareproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class Register2 extends AppCompatActivity {

    private EditText txtNumberReg;
    private EditText txtNameReg;
    private EditText txtUserNameReg;
    private Button addMoreDetails;


    //For database
    FirebaseDatabase database;
    DatabaseReference ref;
    UserData userdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register2_content);

        txtNumberReg = findViewById(R.id.auNumET);
        txtNameReg = findViewById(R.id.auNameET);
        txtUserNameReg = findViewById(R.id.auUserNameET);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("User");
        userdata = new UserData();
        addMoreDetails = findViewById(R.id.addUser2BTN);


    }


    public void btnAdd(View view) {


    //For database
        ref.addValueEventListener(new ValueEventListener() {
        @Override
        public void onDataChange (DataSnapshot dataSnapshot){
            getValues();
            ref.child(userdata.getName()).setValue(userdata);
            Toast.makeText(Register2.this, "Data Added....", Toast.LENGTH_LONG).show();
        }

        @Override
        public void onCancelled (DatabaseError databaseError){

        }
    });


        addMoreDetails = (Button) findViewById(R.id.addUser2BTN);
        addMoreDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(getApplicationContext(), Login2.class);
                startActivity(i);
                finish();
            }
        });
}




    private void getValues(){
        userdata.setName(txtNameReg.getText().toString());
        userdata.setPhone(txtNumberReg.getText().toString());
        userdata.setUserName((txtUserNameReg.getText().toString()));

    }
}
