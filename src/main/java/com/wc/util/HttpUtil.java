//package com.wc.util;
//
//
//import org.apache.http.HttpResponse;
//import org.apache.http.HttpStatus;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.util.EntityUtils;
//
//public class HttpUtil {
//	public static String getUrl(String url){
//		String result="";
//		try {
//			//根据地址获取请求
//			HttpGet httpGet=new HttpGet(url);
//			//获取当前客户端对象
//			HttpClient httpClient = new DefaultHttpClient();
//			// 通过请求对象获取响应对象
//			HttpResponse response=httpClient.execute(httpGet);
//			// 判断网络连接状态码是否正常(0--200都数正常)
//            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
//                result= EntityUtils.toString(response.getEntity());
//            } 
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
//}
