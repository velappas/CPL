package com.example.victorialappas.cpl;

import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.app.Activity;


public class Splash extends Activity {
    private Button b1, b2, b3;
    private int[] layouts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);

        layouts = new int[]{
                R.layout.hr_slide,
                R.layout.volunteer_slide,
                R.layout.admin_slide};
        }

        b1.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v){

           }
    });


    private void launchHRScreen(){

    }

    private void launchVolunteerScreen(){

    }

    private void launchAdminScreen(){


    }
}
