package com.example.hottest.myfragmentdemo1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telecom.TelecomManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MyAFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      /*  TextView tv=new TextView(this.getActivity());
        tv.setText("hello good morning hard city");
        return tv;*/
        View v = inflater.inflate(R.layout.fragment_my_a, null);
        Button bt_frg = (Button) v.findViewById(R.id.bt_frg);
        bt_frg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"this is fragmentA",Toast.LENGTH_LONG).show();
            }
        });
        return v;
    }


}
