package com.wc.service.impl;


import com.wc.dao.UserDao;
import com.wc.entity.User;
import com.wc.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao dao;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void addUser(User item) {
		this.dao.addUser(item);
	}

	@Override
	public User getUserByUserToken(String token) {
		// TODO Auto-generated method stub
		return this.dao.getUserByUserToken(token);
	}

	@Override
	public User getUserByUserId(int uid) {
		// TODO Auto-generated method stub
		return this.dao.getUserByUserId(uid);
	}


	

}
