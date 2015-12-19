package com.example.sprihabiswas.share_draft1.sb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.adapter.NewsInShortAdapter;
import com.example.sprihabiswas.share_draft1.model.Constants;
import com.example.sprihabiswas.share_draft1.model.NewsInShort;

import java.util.ArrayList;

import fr.castorflex.android.verticalviewpager.VerticalViewPager;

/**
 * Created by Spriha Biswas on 10/28/2015.
 */
public class Fragment_News extends Fragment {
    int i;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_news,null);

        Constants.verticalViewPager = (VerticalViewPager) view.findViewById(R.id.verticalviewpager);
        Constants.verticalViewPager.setPageTransformer(true, new DepthPageTransformer());

        Constants.news_adapter = new NewsInShortAdapter(getActivity(),generateData_News());
        Constants.verticalViewPager.setAdapter(Constants.news_adapter);

        return view;

    }

    private ArrayList<NewsInShort> generateData_News() {
        ArrayList<NewsInShort> vpersons = new ArrayList<>();
        for(i=0;i<7;i++)
        {
            vpersons.add(new NewsInShort(Constants.news_heading[i],Constants.news_card_newsinshort[i], Constants.news_card_photos[i]));}


        return vpersons;
    }


}

