package com.wang.zhihuribao;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView txt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.main_page);
		this.initUI();
	}
	
	private void initUI(){
		txt = (TextView) super.findViewById(R.id.txt_title_right);
	}
}
