package com.wc.service;

import com.wc.entity.User;

public interface UserService {
	public void addUser(User item);
	public User getUserByUserToken(String token);
	public User getUserByUserId(int uid);
}
