package com.example.tacademy.sampleviewpagerfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tacademy on 2016-01-26.
 */
public class MyStatePagerAdapter extends FragmentStatePagerAdapter {  //동적으로 프래그먼트를 생성하기 위한 것
    List<String> items = new ArrayList<String>();

    public MyStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void add(String item){
        items.add(item);
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return PagerFragment.newInstance(items.get(position));
    }

    @Override
    public int getCount() {
        return items.size();
    }
}
