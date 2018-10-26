package com.example.fatihpc.materialdesign2.ViewPager;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fatihpc.materialdesign2.R;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        ViewPager viewPager = findViewById( R.id.viewPager );
        PagerAdapter pagerAdapter = new PageAdapter( PageData.getData() , this );
        viewPager.setAdapter( pagerAdapter );
    }

}
