package com.wc.entity;

import java.util.Date;

public class UserClub {
	
	private int id;
	private int clubId;
	private int userId;
	private int relationshipType;
	private Date joinTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClubId() {
		return clubId;
	}
	public void setClubId(int clubId) {
		this.clubId = clubId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(int relationshipType) {
		this.relationshipType = relationshipType;
	}
	public Date getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

}
