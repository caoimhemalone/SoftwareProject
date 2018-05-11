package com.example.caoimhemalone.amazonaws.softwareproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Tab5Frag extends Fragment {
<<<<<<< HEAD
<<<<<<< HEAD
    // Declare a DynamoDBMapper object
<<<<<<< HEAD
//    DynamoDBMapper dynamoDBMapper;
=======
>>>>>>> parent of 7ed55db... mobile hub stuff added
=======
>>>>>>> parent of 7ed55db... mobile hub stuff added
=======
    DynamoDBMapper dynamoDBMapper;
>>>>>>> parent of 0a241d2... mobile hub stuff

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
<<<<<<< HEAD
<<<<<<< HEAD

        //For database
        // Instantiate a AmazonDynamoDBMapperClient
        AmazonDynamoDBClient dynamoDBClient = new AmazonDynamoDBClient(AWSMobileClient.getInstance().getCredentialsProvider());
        this.dynamoDBMapper = DynamoDBMapper.builder()
                .dynamoDBClient(dynamoDBClient)
                .awsConfiguration(AWSMobileClient.getInstance().getConfiguration())
                .build();


=======
>>>>>>> parent of 7ed55db... mobile hub stuff added
=======
>>>>>>> parent of 7ed55db... mobile hub stuff added
        View view = inflater.inflate(R.layout.fragment_tab_5, container, false);
        return view;
    }
}
