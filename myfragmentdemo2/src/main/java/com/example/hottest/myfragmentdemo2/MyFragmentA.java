package com.example.hottest.myfragmentdemo2;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MyFragmentA.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MyFragmentA#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyFragmentA extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_my, null);
        Button bt = (Button) v.findViewById(R.id.bt_morn);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"hard city",Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }

}
