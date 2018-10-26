package com.example.fatihpc.materialdesign2.ViewPagerWithFragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.fatihpc.materialdesign2.R;

public class FragmentPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_paper);

        ViewPager viewPager = findViewById( R.id.viewPager );
        PageFragmentAdapter adapter = new PageFragmentAdapter( getSupportFragmentManager() );
        viewPager.setAdapter( adapter );
    }
}
