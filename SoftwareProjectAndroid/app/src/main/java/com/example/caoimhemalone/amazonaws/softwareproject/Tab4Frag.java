package com.example.caoimhemalone.amazonaws.softwareproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Tab4Frag extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);

        //For database


//        Runnable runnable = new Runnable() {
//            public void run() {
//                //DynamoDB calls go here
//            }
//        };
//        Thread mythread = new Thread(runnable);
//        mythread.start();

View view = inflater.inflate(R.layout.fragment_tab_4, container, false);
        return view;
    }
}
