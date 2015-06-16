package com.wc.dao;


import com.wc.entity.User;

public interface UserDao {
	public void addUser(User item);
	public User getUserByUserToken(String token);
	public User getUserByUserId(int uid);
}
