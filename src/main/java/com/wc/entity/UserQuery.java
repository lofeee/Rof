package com.wc.entity;

public class UserQuery {
	
	private int pageIndex;
	private int pageSize;
	private SortOrder order;
	
	private int userType;
	private String userName;
	private int lockoutStatus;
	private int disabledStatus;
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public SortOrder getOrder() {
		return order;
	}
	public void setOrder(SortOrder order) {
		this.order = order;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getLockoutStatus() {
		return lockoutStatus;
	}
	public void setLockoutStatus(int lockoutStatus) {
		this.lockoutStatus = lockoutStatus;
	}
	public int getDisabledStatus() {
		return disabledStatus;
	}
	public void setDisabledStatus(int disabledStatus) {
		this.disabledStatus = disabledStatus;
	}

}
