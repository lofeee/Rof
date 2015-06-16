package com.wc.entity;

public class ClubQuery {
	
	private int pageIndex;
	private int pageSize;
	private SortOrder order;
	
	private int recommend;
	private String clubName;
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
	public int getRecommend() {
		return recommend;
	}
	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

}
