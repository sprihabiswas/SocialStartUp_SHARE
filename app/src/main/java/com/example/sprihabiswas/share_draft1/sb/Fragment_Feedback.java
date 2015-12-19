package com.example.sprihabiswas.share_draft1.sb;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.Constants;

/**
 * Created by Spriha Biswas on 10/28/2015.
 */
public class Fragment_Feedback extends Fragment {
    SharedPreferences sharedpreferences;
    String x="";
    TextView tv;
    Typeface tf;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_feedback,null);
        add_email_and_typeface(v);



        Button btn_send=(Button)v.findViewById(R.id.button_feedback_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send_feedback();
            }
        });
        return v;
    }
    public void add_email_and_typeface(View view)
    {
        sharedpreferences = getActivity().getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE);

        tv=(TextView)view.findViewById(R.id.tv_feedback_title);
        tv.setTypeface(tf);
        tv=(TextView)view.findViewById(R.id.et_feedback_email);
        tv.setTypeface(tf);
        x=sharedpreferences.getString(Constants.user_emailKey, "");
        System.out.println(x);
        if(!x.equals(""))
        {
            tv.setText(x);
            //should we then disable editing rights?
        }

        tv=(TextView)view.findViewById(R.id.et_feedback_content);
        tv.setTypeface(tf);
    }

    public void send_feedback()
    {}
}
