package com.example.fatihpc.materialdesign2.TabBarLayout.TextTabBar;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fatihpc.materialdesign2.R;

public class TextTabBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_tab_bar);

        TabLayout tabLayout = findViewById( R.id.textTabBar );
        TextTabBarAdapter adapter = new TextTabBarAdapter( getSupportFragmentManager() );

        ViewPager viewPager = findViewById( R.id.viewPager );
        viewPager.setAdapter( adapter );
        tabLayout.setupWithViewPager( viewPager );

        setTabTexts( tabLayout );
    }

    private void setTabTexts( TabLayout tabLayout ) {
        tabLayout.getTabAt(0).setText( "1" );
        tabLayout.getTabAt(1).setText( "2" );
        tabLayout.getTabAt(2).setText( "3" );
        tabLayout.getTabAt(3).setText( "4" );
        tabLayout.getTabAt(4).setText( "5" );
    }

}
