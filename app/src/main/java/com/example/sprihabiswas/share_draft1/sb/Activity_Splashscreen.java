package com.example.sprihabiswas.share_draft1.sb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.Constants;

public class Activity_Splashscreen extends AppCompatActivity {
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 500;
    SharedPreferences sharedpreferences;

    Class home[]={Activity_Login.class, Activity_Tabbed.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity

                sharedpreferences = getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE);

                Constants.logged_in = sharedpreferences.getInt(Constants.LoggedInKey, 0);
                Constants.tab_id=Constants.logged_in;

                //if 0 then open login activity else go to home screen
                Intent i = new Intent(Activity_Splashscreen.this, home[Constants.logged_in]);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }

}
