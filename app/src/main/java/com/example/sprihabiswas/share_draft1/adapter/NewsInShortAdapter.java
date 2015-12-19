package com.example.sprihabiswas.share_draft1.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.Constants;
import com.example.sprihabiswas.share_draft1.model.NewsInShort;
import com.example.sprihabiswas.share_draft1.sb.Activity_EventDetails;
import com.example.sprihabiswas.share_draft1.sb.Activity_NewsDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Spriha Biswas on 10/31/2015.
 */

public class NewsInShortAdapter extends PagerAdapter {
    private List<NewsInShort> vnews;

    Context mContext;
    LayoutInflater mLayoutInflater;
    Typeface tf;


    public NewsInShortAdapter(Context context, List<NewsInShort> vnews) {
        this.vnews = new ArrayList<>();
        this.vnews.addAll(vnews);
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return vnews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        final View itemView = mLayoutInflater.inflate(R.layout.card_view_news, container, false);


        NewsInShort news = vnews.get(position);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.news_card_photo);
        imageView.setImageResource(news.getNews_card_photo());

        tf = Typeface.createFromAsset(itemView.getContext().getAssets(), Constants.fontpath_regular);
        TextView tv= (TextView) itemView.findViewById(R.id.news_card_heading);
        tv.setTypeface(tf);
        tv.setText(news.getNews_card_heading());

        tf = Typeface.createFromAsset(itemView.getContext().getAssets(), Constants.fontpath_light);
        tv= (TextView) itemView.findViewById(R.id.news_card_content);
        tv.setTypeface(tf);
        tv.setText(news.getNews_card_content());

        container.addView(itemView);

        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Constants.NewsPosition=position;
                Context c = v.getContext();
                Intent i = new Intent(c, Activity_NewsDetail.class);
                c.startActivity(i);
                return false;
            }
        });
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
