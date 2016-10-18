package com.example.swathi.viewpagerwithfragment.adapters;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by user on 10/18/2016.
 */

public class MyFragmentPageAdapter extends FragmentPagerAdapter {

    List<Fragment> fragmentList;
    public MyFragmentPageAdapter(android.support.v4.app.FragmentManager fragmentManager, List<Fragment> fragmentList)
    {
        super(fragmentManager);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
