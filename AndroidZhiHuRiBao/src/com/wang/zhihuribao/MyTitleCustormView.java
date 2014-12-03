package com.wang.zhihuribao;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

public class MyTitleCustormView extends FrameLayout {

	public MyTitleCustormView(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.title_main, this);
	}
}
