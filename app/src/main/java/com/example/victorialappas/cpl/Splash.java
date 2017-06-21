package com.example.victorialappas.cpl;

import android.os.Bundle;
import android.widget.*;
import android.view.View;
import android.app.Activity;
import android.content.Intent;


public class Splash extends Activity {
    private Button b1, b2, b3;
    private ImageView logo;
    private int[] layouts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        logo = (ImageView) findViewById(R.id.imageView);
        logo.setImageResource(R.drawable.calgary_public_library_logo);


        layouts = new int[]{
                R.layout.activity_hr,
                R.layout.activity_volunteer,
                R.layout.activity_admin};
    }




    public void launchHRScreen(View v){
           startActivity(new Intent(Splash.this, HRActivity.class));
           finish();
    }

    public void launchVolunteerScreen(View v){
        startActivity(new Intent(Splash.this, VolunteerActivity.class));
        finish();
    }

    public void launchAdminScreen(View v){
        startActivity(new Intent(Splash.this, AdminActivity.class));
        finish();
    }
}

