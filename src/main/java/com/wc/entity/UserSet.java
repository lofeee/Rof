package com.wc.entity;

import java.util.List;

public class UserSet {
	
	private List<User> list;
	private int totalRecords;
	public List<User> getList() {
		return list;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	
	public UserSet(List<User> list, int totalRecords) {
		this.list=list;
		this.totalRecords=totalRecords;
	}

}
