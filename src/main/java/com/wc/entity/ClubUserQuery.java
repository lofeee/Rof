package com.wc.entity;

public class ClubUserQuery {
	
	private int pageIndex;
	private int pageSize;
	private SortOrder order;
	
	private int clubId;
	private int relationshipType;
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
	public int getClubId() {
		return clubId;
	}
	public void setClubId(int clubId) {
		this.clubId = clubId;
	}
	public int getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(int relationshipType) {
		this.relationshipType = relationshipType;
	}

}
