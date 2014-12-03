package com.wang.zhihuribao;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MySlideCustormerView extends FrameLayout {
	private ViewPager pager;
	private LinearLayout linear;

	public MySlideCustormerView(Context context, AttributeSet attrs) {
		super(context, attrs);

		this.initUI();
	}

	private void initUI() {
		this.pager = (ViewPager) super.findViewById(R.id.viewpager_slide_main);
		this.linear = (LinearLayout) super.findViewById(R.id.linear_slide_main);
	}

	
	
	private class MyPagerAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			// TODO Auto-generated method stub
			return super.instantiateItem(container, position);
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			// TODO Auto-generated method stub
			super.destroyItem(container, position, object);
		}
	}
}
