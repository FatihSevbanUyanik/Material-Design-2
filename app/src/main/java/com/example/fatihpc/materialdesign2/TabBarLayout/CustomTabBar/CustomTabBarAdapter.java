package com.example.fatihpc.materialdesign2.TabBarLayout.CustomTabBar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.fatihpc.materialdesign2.TabBarLayout.Fragments.FragmentA;
import com.example.fatihpc.materialdesign2.TabBarLayout.Fragments.FragmentB;
import com.example.fatihpc.materialdesign2.TabBarLayout.Fragments.FragmentC;
import com.example.fatihpc.materialdesign2.TabBarLayout.Fragments.FragmentD;
import com.example.fatihpc.materialdesign2.TabBarLayout.Fragments.FragmentE;

public class CustomTabBarAdapter extends FragmentStatePagerAdapter {

    private final int FRAGMENT_COUNT = 5;

    public CustomTabBarAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if ( position == 0 )
            return new FragmentA();

        else if ( position == 1 )
            return new FragmentB();

        else if ( position == 2 )
            return new FragmentC();

        else if ( position == 3 )
            return new FragmentD();

        else if ( position == 4 )
            return new FragmentE();

        return new FragmentA();
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

}