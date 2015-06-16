package com.wc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.jsp.jstl.sql.Result;




public class SaeTest {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
//		Class.forName("com.mysql.jdbc.Driver");
//		String url="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_tewechar";
//		String user="w42kz30w53";
//		String pwd="k3m1i1i4ijyhxi25mji121jm43lxz3zwwz5wyzjk";
//
//		Connection conn= DriverManager.getConnection(url,user,pwd);
//		String sql="insert into sp_users(UserToken,UserName,Password,Email,Mobile,RegistIp,RegistTime,LastLoginIp,LastLoginTime,Avatar,Name,UserType,Lockout,Disabled) values('"
//				+ "asd','uname','123','123','','','','','','','','',1,0,1)";
//		PreparedStatement ps=conn.prepareStatement(sql);
//		int i=ps.executeUpdate();
//		System.out.println(i);
		
//		String URL="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_tewechar";
//		String username=SaeUserInfo.getAccessKey();
//		String password=SaeUserInfo.getSecretKey();
//		String driver="com.mysql.jdbc.Driver";
//		Class.forName(driver).newInstance();
//		Connection con=DriverManager.getConnection(URL,username,password);
//		System.out.println(username+""+password);


		// 使用从库读数据
		String URL="jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_tewechar";
		String sql = "SELECT * FROM app_table";
		// 通过SaeUserInfo提供的静态方法获取应用的access_key和secret_key
		String Username="w42kz30w53";
		String Password="k3m1i1i4ijyhxi25mji121jm43lxz3zwwz5wyzjk";
		String Driver="com.mysql.jdbc.Driver";
		Class.forName(Driver).newInstance();
		Connection con=DriverManager.getConnection(URL,Username,Password);
	}
}
