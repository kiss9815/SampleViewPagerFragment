package com.example.tacademy.sampleviewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Tacademy on 2016-01-26.
 */
public class MyPagerAdapter extends FragmentPagerAdapter { //정적으로 만드는 것
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private static final int ITEM_COUNT = 5;

    @Override
    public Fragment getItem(int position) {

        return PagerFragment.newInstance("" + position);
    }

    @Override
    public int getCount() {
        return ITEM_COUNT;
    }
}
