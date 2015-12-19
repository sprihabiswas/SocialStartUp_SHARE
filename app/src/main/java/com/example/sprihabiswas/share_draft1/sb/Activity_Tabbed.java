package com.example.sprihabiswas.share_draft1.sb;

import android.content.Context;
import android.content.SharedPreferences;
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

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.Constants;

public class Activity_Tabbed extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Menu m;
    int j,l;
    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        sharedpreferences = getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE);
        Constants.logged_in = sharedpreferences.getInt(Constants.LoggedInKey, 0);
        /**
         *Setup the DrawerLayout and NavigationView
         */

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);


        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.containerView,new Fragment_Tabs()).commit();
        /**
         * Setup click events on the Navigation View Items.
         */
        Constants.mNavigationView = (NavigationView) findViewById(R.id.navigation_view) ;
        select_menu(Constants.logged_in);

        Constants.mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                sharedpreferences = getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE);

                Constants.logged_in = sharedpreferences.getInt(Constants.LoggedInKey, 0);
                Fragment menu[];
                int menu_id[];
                if(Constants.logged_in==0)
                {
                    menu=Constants.menu_loggedOut;
                    menu_id=Constants.menu_loggedOut_id;
                }
                else
                {
                    menu=Constants.menu_loggedIn;
                    menu_id=Constants.menu_loggedIn_id;
                }
                int l = menu.length;
                sharedpreferences = getSharedPreferences(Constants.MyPREFERENCES, Context.MODE_PRIVATE);
                Constants.logged_in = sharedpreferences.getInt(Constants.LoggedInKey, 0);

                int selected_id=menuItem.getItemId();
                if(selected_id==R.id.nav_item_home)
                    Constants.tab_id=1;
                if(selected_id==R.id.nav_item_login)
                    Constants.tab_id=0;

                for (j = 0; j < l; j++) {
                    if (selected_id== menu_id[j]) {
                        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                        fragmentTransaction.replace(R.id.containerView, menu[j]).commit();

                    }
                }

                return false;
            }

        });

        /**+++++++++++++++++++++++++++++++++++++++++++++++
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();

    }
    public void select_menu(int y)
    {
        m=Constants.mNavigationView.getMenu();
        m.clear();
        Constants.mNavigationView.inflateMenu(Constants.drawer_menu_ids[y]);
    }

    public void finish_this()
    {
        finish();
    }
}
