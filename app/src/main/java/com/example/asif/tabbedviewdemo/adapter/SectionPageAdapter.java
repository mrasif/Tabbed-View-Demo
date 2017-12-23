package com.example.asif.tabbedviewdemo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asif on 12/23/17.
 */

public class SectionPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragments=new ArrayList<>();
    private final List<String> titles=new ArrayList<>();

    public void addFragment(Fragment fragment, String title) {
        this.fragments.add(fragment);
        this.titles.add(title);
    }

    public SectionPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
