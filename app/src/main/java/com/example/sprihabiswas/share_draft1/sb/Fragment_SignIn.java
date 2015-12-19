package com.example.sprihabiswas.share_draft1.sb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sprihabiswas.share_draft1.R;

/**
 * Created by Spriha Biswas on 10/28/2015.
 */
public class Fragment_SignIn extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_signin,null);
    }
}
