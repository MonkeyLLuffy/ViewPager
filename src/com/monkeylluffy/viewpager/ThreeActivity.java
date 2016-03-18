package com.monkeylluffy.viewpager;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class ThreeActivity extends Activity {

	ViewPager vpager_two;
    private ArrayList<View> aList;
    private ArrayList<String> sList;
    MyPagerAdapter2 adpter;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        
        vpager_two = (ViewPager) findViewById(R.id.vpager_three);
        aList = new ArrayList<View>();
        
        sList = new ArrayList<String>();
        
        LayoutInflater li = getLayoutInflater();
        
        aList.add(li.inflate(R.layout.view_one, null,false));
        aList.add(li.inflate(R.layout.view_two, null,false));
        aList.add(li.inflate(R.layout.view_three,null, false));
        
        sList.add("第一页");
        sList.add("第二页");
        sList.add("第三页");
        
        adpter = new MyPagerAdapter2(aList,sList);
        vpager_two.setAdapter(adpter);
        
        
	}
}
