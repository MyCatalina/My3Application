package com.example.hottest.myfragmentdemo2;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyFragmentB.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyFragmentB#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyFragmentB extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_fragment_b, container, false);
    }


}
