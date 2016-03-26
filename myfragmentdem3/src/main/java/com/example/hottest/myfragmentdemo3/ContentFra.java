package com.example.hottest.myfragmentdemo3;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hottest on 2016/3/16.
 */
public class ContentFra extends Fragment {

    private TextView tv_conten;
    private ImageView iv_fragmentb;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View inflate = inflater.inflate(R.layout.fragment_b, null);
        tv_conten = (TextView)inflate.findViewById(R.id.tv_content);
         iv_fragmentb= (ImageView) inflate.findViewById(R.id.iv_fragmentb);
        return inflate;
    }

    public void setImage(int i) {
        this.iv_fragmentb.setImageResource(i);
    }

    public void setTitle(String str) {
        this.tv_conten.setText(str);
    }
}


