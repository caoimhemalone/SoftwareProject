package com.example.caoimhemalone.amazonaws.softwareproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount=tabCount;
    }



    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0 :
                Tab1Frag tab1Frag = new Tab1Frag();
                return tab1Frag;

            case 1 :
                Tab2Frag tab2Frag = new Tab2Frag();
                return tab2Frag;

            case 2 :
                Tab3Frag tab3Frag = new Tab3Frag();
                return tab3Frag;

            case 3 :
                Tab4Frag tab4Frag = new Tab4Frag();
                return tab4Frag;

            case 4 :
                Tab5Frag tab5Frag = new Tab5Frag();
                return tab5Frag;


            default:return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
