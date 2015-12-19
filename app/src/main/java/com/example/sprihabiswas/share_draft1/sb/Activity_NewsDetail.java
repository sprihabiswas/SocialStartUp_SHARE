package com.example.sprihabiswas.share_draft1.sb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.Constants;

public class Activity_NewsDetail extends AppCompatActivity {
    ImageView iv;
    TextView tv;
    Typeface tf;

    Activity_Tabbed at_ob=new Activity_Tabbed();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.news_detail_toolbar);
        //to add the back button to toolbar
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //to add the back action to the back button
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constants.verticalViewPager.setCurrentItem(Constants.NewsPosition);
                onBackPressed();
                overridePendingTransition(R.animator.activity_back_in, R.animator.activity_back_out);


            }
        });

        set_news_and_typeface();
    }
    public void set_news_and_typeface()
    {
        iv=(ImageView)findViewById(R.id.news_detail_image1);
        iv.setImageResource(Constants.news_card_photos[Constants.NewsPosition]);

        iv=(ImageView)findViewById(R.id.news_detail_image2);
        iv.setImageResource(Constants.news_card_photos[Constants.NewsPosition]);

        tf = Typeface.createFromAsset(getAssets(), Constants.fontpath_regular);
        tv=(TextView)findViewById(R.id.news_detail_heading);
        tv.setText(Constants.news_heading[Constants.NewsPosition]);
        tv.setTypeface(tf);

        tf = Typeface.createFromAsset(getAssets(), Constants.fontpath_light);
        tv=(TextView)findViewById(R.id.news_detail_content1);
        tv.setText(Constants.news_card_newsinshort[Constants.NewsPosition]);
        tv.setTypeface(tf);

        tv=(TextView)findViewById(R.id.news_detail_content2);
        tv.setText(Constants.news_card_newsinshort[Constants.NewsPosition]);
        tv.setTypeface(tf);

        //tv=(TextView)findViewById(R.id.news_detail_by)
    }
    public void next_detail_news(View v)
    {
        Constants.NewsPosition=Constants.NewsPosition+1;
        Intent i=new Intent(this, Activity_NewsDetail.class);
        startActivity(i);
        overridePendingTransition(R.animator.activity_in, R.animator.activity_out);
        finish();

    }


}
