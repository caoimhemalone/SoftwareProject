package com.example.caoimhemalone.amazonaws.softwareproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Tab3Frag extends Fragment {
<<<<<<< HEAD
<<<<<<< HEAD
    // Declare a DynamoDBMapper object
//    DynamoDBMapper dynamoDBMapper;
=======
>>>>>>> parent of 7ed55db... mobile hub stuff added
=======
>>>>>>> parent of 7ed55db... mobile hub stuff added

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
<<<<<<< HEAD
<<<<<<< HEAD
        //For database
        // Instantiate a AmazonDynamoDBMapperClient
//        AmazonDynamoDBClient dynamoDBClient = new AmazonDynamoDBClient(AWSMobileClient.getInstance().getCredentialsProvider());
//        this.dynamoDBMapper = DynamoDBMapper.builder()
//                .dynamoDBClient(dynamoDBClient)
//                .awsConfiguration(AWSMobileClient.getInstance().getConfiguration())
//                .build();

=======
>>>>>>> parent of 7ed55db... mobile hub stuff added
=======
>>>>>>> parent of 7ed55db... mobile hub stuff added
        View view = inflater.inflate(R.layout.fragment_tab_3, container, false);
        return view;
    }
}
