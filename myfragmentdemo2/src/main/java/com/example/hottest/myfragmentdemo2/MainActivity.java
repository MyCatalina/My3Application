package com.example.hottest.myfragmentdemo2;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private FrameLayout fl_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt_b1 = (Button) findViewById(R.id.bt_b1);
        Button bt_b2 = (Button) findViewById(R.id.bt_b2);
        Button bt_b3 = (Button) findViewById(R.id.bt_b3);
        Button bt_b4 = (Button) findViewById(R.id.bt_b4);
        bt_b1.setOnClickListener(this);
        bt_b2.setOnClickListener(this);
        bt_b3.setOnClickListener(this);
        bt_b4.setOnClickListener(this);
        fl_content = (FrameLayout) findViewById(R.id.fl_content);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_b1:
                addFragement();
                break;
            case R.id.bt_b2:
                addFragementB();
                break;
            case R.id.bt_b3:
                break;
            case R.id.bt_b4:
                break;
        }
    }

    public void addFragement() {
        //实例化一个MyFragementA
        Fragment fraA = new MyFragmentA();
//       移除fl_content下的所有子视图
        fl_content.removeAllViews();
        //fragment的动态添加
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fl_content, fraA);
        fragmentTransaction.commit();

    }

    public void addFragementB() {
        MyFragmentB frag = new MyFragmentB();
        fl_content.removeAllViews();
        final FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fl_content, frag);
        fragmentTransaction.commit();
    }

}
