package com.monkeylluffy.viewpager;

import java.util.ArrayList;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyPagerAdapter2 extends PagerAdapter{
	private ArrayList<View> viewList;
	private ArrayList<String> titleLists;
	
	public MyPagerAdapter2(ArrayList<View> views,ArrayList<String> titles) {
		// TODO Auto-generated constructor stub
		this.viewList = views;
		this.titleLists = titles;
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return viewList.size();
	}

	@Override
	public boolean isViewFromObject(View view, Object obj) {
		// TODO Auto-generated method stub
		return view == obj;
	}
	
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		// TODO Auto-generated method stub
		container.addView(viewList.get(position));
		return viewList.get(position);
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		container.removeView(viewList.get(position));
	}
//用于第二个Activity,得到title
    @Override
    public CharSequence getPageTitle(int position) {
        return titleLists.get(position);
    }

}
