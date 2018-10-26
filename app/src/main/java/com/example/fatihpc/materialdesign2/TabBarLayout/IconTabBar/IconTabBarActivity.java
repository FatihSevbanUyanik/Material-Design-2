package com.example.fatihpc.materialdesign2.TabBarLayout.IconTabBar;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fatihpc.materialdesign2.R;

public class IconTabBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_tab_bar);

        TabLayout tabLayout = findViewById( R.id.iconTabBar );
        IconTabBarAdapter adapter = new IconTabBarAdapter( getSupportFragmentManager() );

        ViewPager viewPager = findViewById( R.id.viewPager );
        viewPager.setAdapter( adapter );
        tabLayout.setupWithViewPager( viewPager );

        setTabIcons( tabLayout );
    }

    private void setTabIcons( TabLayout tabLayout ) {
        tabLayout.getTabAt(0).setIcon( R.drawable.facebook );
        tabLayout.getTabAt(1).setIcon( R.drawable.googleplus );
        tabLayout.getTabAt(2).setIcon( R.drawable.instagram );
        tabLayout.getTabAt(3).setIcon( R.drawable.netflix );
        tabLayout.getTabAt(4).setIcon( R.drawable.twitter );
    }

}