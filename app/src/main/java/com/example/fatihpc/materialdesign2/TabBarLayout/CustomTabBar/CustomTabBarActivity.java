package com.example.fatihpc.materialdesign2.TabBarLayout.CustomTabBar;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.fatihpc.materialdesign2.R;

public class CustomTabBarActivity extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tab_bar);

        tabLayout = findViewById( R.id.customTabBar );
        CustomTabBarAdapter adapter = new CustomTabBarAdapter( getSupportFragmentManager() );

        ViewPager viewPager = findViewById( R.id.viewPager );
        viewPager.setAdapter( adapter );
        tabLayout.setupWithViewPager( viewPager );

        setTabBar( 0 , "Ex1" , "Tab1" );
        setTabBar( 1 , "Ex2" , "Tab2" );
        setTabBar( 2 , "Ex3" , "Tab3" );
        setTabBar( 3 , "Ex4" , "Tab4" );
        setTabBar( 4 , "Ex5" , "Tab5" );
    }

    private void setTabBar( int position , String title , String subtitle )
    {
        LayoutInflater layoutInflater = LayoutInflater.from(  this );
        View customView = layoutInflater.inflate( R.layout.tab_bar_item_layout , null );

        TextView titleTextView = customView.findViewById( R.id.titleTextView );
        TextView subtitleTextView = customView.findViewById( R.id.subtitleTextView );

        titleTextView.setText( title );
        subtitleTextView.setText( subtitle );

        tabLayout.getTabAt( position ).setCustomView( customView );
    }

}