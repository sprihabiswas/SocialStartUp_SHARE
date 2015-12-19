package com.example.sprihabiswas.share_draft1.sb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.Constants;

/**
 * Created by Spriha Biswas on 10/28/2015.
 */
public class Fragment_Tabs extends Fragment {

    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         *Inflate tab_layout and setup Views.
         */
        View x =  inflater.inflate(R.layout.tab_layout,null);
        tabLayout = (TabLayout) x.findViewById(R.id.tabs);
        viewPager = (ViewPager) x.findViewById(R.id.viewpager);

        int_items= Constants.num_items[Constants.tab_id] ;

        /**
         *Set an Apater for the View Pager
         */
        //viewPager.setOverScrollMode(View.OVER_SCROLL_NEVER);
        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));

        //this is to set the center tab i.e. news to open
        viewPager.setCurrentItem(1, false);

        /**
         * Now , this is a workaround ,
         * The setupWithViewPager dose't works without the runnable .
         * Maybe a Support Library Bug .
         */

        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        return x;

    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Return fragment with respect to Position .
         */

        @Override
        public Fragment getItem(int position)
        {
            if(Constants.tab_id==0)
            {
                switch(position)
                {
                    case 0: return Constants.signinup[0];
                    case 1: return Constants.signinup[1];
                }
            }
            else
            {
                switch (position)
                {
                    case 0: return Constants.main[0];
                    case 1: return Constants.main[1];
                    case 2: return Constants.main[2];
                }
            }

            return null;
        }

        @Override
        public int getCount() {

            return int_items;

        }

        /**
         * This method returns the title of the tab according to the position.
         */

        @Override
        public CharSequence getPageTitle(int position) {
            if(Constants.tab_id==0)
            {
                switch(position)
                {
                    case 0: return Constants.tab_titles_signinup[0];
                    case 1: return Constants.tab_titles_signinup[1];
                }
            }
            else
            {
                switch (position)
                {
                    case 0: return Constants.tab_titles_main[0];
                    case 1: return Constants.tab_titles_main[1];
                    case 2: return Constants.tab_titles_main[2];
                }
            }


            return null;
        }
    }

}