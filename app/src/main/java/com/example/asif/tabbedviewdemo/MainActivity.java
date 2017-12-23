package com.example.asif.tabbedviewdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.asif.tabbedviewdemo.adapter.SectionPageAdapter;
import com.example.asif.tabbedviewdemo.fragments.Tab1Fragment;
import com.example.asif.tabbedviewdemo.fragments.Tab2Fragment;
import com.example.asif.tabbedviewdemo.fragments.Tab3Fragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private SectionPageAdapter sectionPageAdapter;
    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.sectionPageAdapter=new SectionPageAdapter(getSupportFragmentManager());
        mViewPager=findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabs=findViewById(R.id.tabs);
        tabs.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager){
        SectionPageAdapter adapter=new SectionPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(),"Tab 1");
        adapter.addFragment(new Tab2Fragment(),"Tab 2");
        adapter.addFragment(new Tab3Fragment(),"Tab 3");
        viewPager.setAdapter(adapter);
    }
}
