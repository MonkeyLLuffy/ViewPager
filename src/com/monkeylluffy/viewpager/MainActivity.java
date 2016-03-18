package com.monkeylluffy.viewpager;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	ArrayList<View> viewLists;
	MyPagerAdapter adpter;
	private ViewPager vPager_one;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		vPager_one = (ViewPager) findViewById(R.id.viewPager);
		
		LayoutInflater li = getLayoutInflater();
		viewLists = new ArrayList<View>();
		viewLists.add(li.inflate(R.layout.view_one, null,false));
		viewLists.add(li.inflate(R.layout.view_two, null,false));
		viewLists.add(li.inflate(R.layout.view_three, null,false));
		
		adpter = new MyPagerAdapter(viewLists);
		vPager_one.setAdapter(adpter);
	}


}
