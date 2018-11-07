package com.idejie.android.pix2tex.fragments;



import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.idejie.android.pix2tex.R;


public class CameraFragment extends Fragment {



    View view;

    public CameraFragment() {
        // Required empty public constructor
    }

    public static CameraFragment newInstance() {
        CameraFragment fragment = new CameraFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_camera, container, false);

        return view;
    }



}
