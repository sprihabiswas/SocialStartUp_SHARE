package com.example.sprihabiswas.share_draft1.sb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.Constants;

public class Activity_EventDetails extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Menu m;
    int j, l;
    Typeface tf;
    TextView tv;
    ImageView iv;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_details);

        //to typeface
        ed_setdata_and_typeface();

        sharedpreferences = getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE);
        Constants.logged_in = sharedpreferences.getInt(Constants.LoggedInKey, 0);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.event_detail_toolbar);
        //to add the back button to toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //to add the back action to the back button
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                overridePendingTransition(R.animator.activity_back_in, R.animator.activity_back_out);
            }
        });

        //changing color of fab
        FloatingActionButton fab_ed = (FloatingActionButton)findViewById(R.id.fab_event_details);
        fab_ed.setBackgroundTintList(getResources().getColorStateList(R.color.button_callforaction));
        fab_ed.setRippleColor(getResources().getColor(R.color.button_callforaction));
        fab_ed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                share_event();
            }
        });

    }
    public void ed_setdata_and_typeface()
    {
        iv=(ImageView)findViewById(R.id.iv_event_detail_image);
        iv.setImageResource(Constants.event_photoIds[Constants.EventPosition]);
        tf = Typeface.createFromAsset(getAssets(), Constants.fontpath_light);
        tv=(TextView)findViewById(R.id.tv_event_detail_name);
        tv.setText(Constants.event_name[Constants.EventPosition]);
        tv.setTypeface(tf);

        tv=(TextView)findViewById(R.id.tv_event_detail_by);
        tv.setText(Constants.event_by[Constants.EventPosition]);
        tv.setTypeface(tf);

        ((TextView)findViewById(R.id.tv_event_detail_desc_heading)).setTypeface(tf);

        tv=(TextView)findViewById(R.id.tv_event_detail_desc);
        tv.setText(Constants.event_desc[0]);
        tv.setTypeface(tf);
        ((TextView)findViewById(R.id.tv_event_detail_from)).setTypeface(tf);
        ((TextView)findViewById(R.id.tv_event_detail_from_date)).setTypeface(tf);
        ((TextView)findViewById(R.id.tv_event_detail_from_time)).setTypeface(tf);
        ((TextView)findViewById(R.id.tv_event_detail_to)).setTypeface(tf);
        ((TextView)findViewById(R.id.tv_event_detail_to_date)).setTypeface(tf);
        ((TextView)findViewById(R.id.tv_event_detail_to_time)).setTypeface(tf);
        ((TextView)findViewById(R.id.tv_event_detail_location_heading)).setTypeface(tf);

        tv=(TextView)findViewById(R.id.tv_event_detail_location);
        tv.setText("Shivaji Park \nKL Walawakar Marg \nJeevan Nagar Off New Link Road \nOpposite Star Bazaar, Andheri West \nMumbai, India");
        tv.setTypeface(tf);
        ((Button)findViewById(R.id.button_event_apply)).setTypeface(tf);

    }

    //share method
    public void share_event()
    {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");

        String share_content="My name is"+Constants.EventPosition;
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, share_content);

        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }

    public void apply_for_event(View v)
    {
        sharedpreferences = getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE);
        Constants.logged_in = sharedpreferences.getInt(Constants.LoggedInKey, 0);

        if(Constants.logged_in==0)
        {
            Constants.tab_id=0;

            Intent i=new Intent(this,Activity_Tabbed.class);
            startActivity(i);
            Toast.makeText(this,"Please login to continue",Toast.LENGTH_SHORT).show();
            //there is a bug here which needs to be resolved.
        }
        else
        {
            Intent i=new Intent(this,Activity_Tabbed.class);
            startActivity(i);
            //opens volunteer form
        }
    }

}