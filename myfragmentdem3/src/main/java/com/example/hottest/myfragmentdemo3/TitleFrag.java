package com.example.hottest.myfragmentdemo3;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Created by hottest on 2016/3/16.
 */
public class TitleFrag extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // View v=inflater.inflate(R.layout.fragment_title,container,false);
      /*  Toast.makeText(getActivity(),"fghhh",Toast.LENGTH_LONG).show();
        Log.i("fdsf","下个路口再见吧");*/

      ListView lv = new ListView(getActivity());
      // ListView lv= (ListView) v.findViewById(R.id.lv_show);
        lv.setBackgroundColor(getResources().getColor(R.color.bright_foreground_disabled_material_light));

        final String[] titles = {"news 1", "news 2", "news 3", "news 4", "news 5", "news 6"};
        final int[] pic = {R.drawable.p_1, R.drawable.p_2, R.drawable.p_3,
                R.drawable.p_4, R.drawable.p_5, R.drawable.p_6};

        //使用系统提供的UI资源，通过android.R.layout.simple_list_item_1
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter
                <String>(getActivity(), android.R.layout.simple_list_item_1, titles);
        lv.setAdapter(stringArrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager = getFragmentManager();
//                通过manager找到需要进行引用的Fragement
                ContentFra con = (ContentFra) fragmentManager.findFragmentById(R.id.fl_content);
                con.setTitle(titles[position]);
                con.setImage(pic[position]);
            }
        });

        return lv;
    }
}
