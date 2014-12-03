package com.wang.zhihuribao.netutils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.http.HttpStatus;

/**
 * 数据库链接层，获取与数据库的链接
 * @author Administrator
 *
 */
public class ConnectUtils {
	public static HttpURLConnection getConnection(String address) {
		URL url = null;
		HttpURLConnection connection = null;
		try {
			url = new URL(address);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			if (connection.getResponseCode() != HttpStatus.SC_OK) {
				return null;
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
