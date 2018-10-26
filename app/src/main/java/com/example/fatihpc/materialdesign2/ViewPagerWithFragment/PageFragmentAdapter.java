package com.example.fatihpc.materialdesign2.ViewPagerWithFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageFragmentAdapter extends FragmentStatePagerAdapter {

    private int ITEM_COUNT = 5;

    public PageFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if ( position == 0 ) {
            return new FragmentA();
        }

        else if ( position == 1 ) {
            return new FragmentB();
        }

        else if ( position == 2 ) {
            return new FragmentC();
        }

        else if ( position == 3 ) {
            return new FragmentD();
        }

        else if ( position == 4 ) {
            return new FragmentE();
        }

        return new FragmentA();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
