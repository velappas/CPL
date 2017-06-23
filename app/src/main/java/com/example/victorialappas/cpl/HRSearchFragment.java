package com.example.victorialappas.cpl;

/**
 * Created by victorialappas on 2017-06-22.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.sql.*;
import java.lang.*;



public class HRSearchFragment extends Fragment {
    //this needs to be edited
     static String DB_IP = "jdbc:mysql://104.196.251.57/homebound_mySQL";
     static String USER = "root";
     static String PASS = "slkG8qUx";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Class.forName("com.mysql.jdbc.Driver").newInstance();
        return inflater.inflate(R.layout.hrsearch_fragment, container, false);
    }

    public void launchSearch(){


    }





}
