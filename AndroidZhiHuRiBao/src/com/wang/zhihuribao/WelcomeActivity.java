package com.wang.zhihuribao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import com.wang.zhihuribao.myinterface.MyInterface;

public class WelcomeActivity extends Activity {
	private  NetworkImageView netImg;
	private RequestQueue mqueue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome_page);
		this.initUI();
		this.ImageSetAnimation();
	}

	public void initUI() {
		this.netImg = (NetworkImageView) super.findViewById(R.id.img_mainactivity);
	}

	/**
	 * 该方法为设置动画效果的方法
	 */
	private void ImageSetAnimation() {
		RequestQueue mqueue = Volley.newRequestQueue(getApplicationContext());
		mqueue.add();
		
		ScaleAnimation animation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
				0.5f);
		animation.setDuration(3000);
		animation.setFillAfter(true);// 动画完成后保留状态
		img.setAnimation(animation);
		img.startAnimation(animation);
		this.openMainPage();
	}

	private void openMainPage() {
		Intent intent = new Intent(this, MainActivity.class);
		this.startActivity(intent);
		this.finish();
	}
}
