package com.example.asif.tabbedviewdemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asif.tabbedviewdemo.R;

/**
 * Created by asif on 12/23/17.
 */

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab3_fragment, container, false);
        
        return view;
    }
}
