package com.example.user.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 16/03/2016.
 */
public class PlaceholderFragment extends Fragment// on doit utiliser la version 4 du fragment
 {
     @Nullable
     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View v=inflater.inflate(R.layout.fragment_main,null);
         TextView textview= (TextView) v.findViewById(R.id.section_label);
         return v;
     }
 }
