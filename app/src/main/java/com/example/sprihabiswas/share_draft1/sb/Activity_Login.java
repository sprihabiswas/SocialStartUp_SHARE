package com.example.sprihabiswas.share_draft1.sb;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.Constants;

public class Activity_Login extends AppCompatActivity {
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void call_signinup(View v)
    {
        Constants.tab_id=0;
        next_screen();

    }
    public void skip_signinup(View v)
    {
        Constants.tab_id=1;
        next_screen();
    }

    public void next_screen()
    {
        Intent i=new Intent(this,Activity_Tabbed.class);
        startActivity(i);
        finish();

    }

}
