package com.example.fatihpc.materialdesign2.TabBarLayout.IconTextTabBar;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fatihpc.materialdesign2.R;

public class IconTextTabBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon_text_tab_bar);

        TabLayout tabLayout = findViewById( R.id.iconTextTabBar );
        IconTextTabBarAdapter adapter = new IconTextTabBarAdapter( getSupportFragmentManager() );

        ViewPager viewPager = findViewById( R.id.viewPager );
        viewPager.setAdapter( adapter );
        tabLayout.setupWithViewPager( viewPager );

        setTabTextsAndIcons( tabLayout );
    }

    private void setTabTextsAndIcons( TabLayout tabLayout ) {
        tabLayout.getTabAt(0).setIcon( R.drawable.facebook );
        tabLayout.getTabAt(1).setIcon( R.drawable.googleplus );
        tabLayout.getTabAt(2).setIcon( R.drawable.instagram );
        tabLayout.getTabAt(3).setIcon( R.drawable.netflix );
        tabLayout.getTabAt(4).setIcon( R.drawable.twitter );

        tabLayout.getTabAt(0).setText( "1" );
        tabLayout.getTabAt(1).setText( "2" );
        tabLayout.getTabAt(2).setText( "3" );
        tabLayout.getTabAt(3).setText( "4" );
        tabLayout.getTabAt(4).setText( "5" );
    }

}
