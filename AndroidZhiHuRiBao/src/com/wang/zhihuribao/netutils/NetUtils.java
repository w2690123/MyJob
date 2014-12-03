package com.wang.zhihuribao.netutils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.sql.Connection;
import java.util.Scanner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.wang.zhihuribao.myinterface.MyInterface;
/**
 * 用于静态加载数据的类
 * @author Administrator
 *
 */
public class NetUtils {
	
	public static String getImageURL(String url){
		HttpURLConnection connection = ConnectUtils.getConnection(url);
		String address = null;
		if(connection!=null){
			InputStream is =null;
			Scanner sc = null;
			try {
				is = connection.getInputStream();
				sc = new Scanner(is);
				while(sc.hasNext()){
					address = sc.next();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return address;	
	}
	
	public static Bitmap getBitmap(String address){
		HttpURLConnection connection = ConnectUtils.getConnection(address);
		Bitmap bitmap = null;
		if(connection!= null){
			InputStream is = null;
			try {
				is = connection.getInputStream();
				bitmap = BitmapFactory.decodeStream(is);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bitmap;
	}
}
