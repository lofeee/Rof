package com.wc.entity;

import java.util.List;

public class ClubSet {
	
	private List<Club> list;
	private int totalRecords;
	public List<Club> getList() {
		return list;
	}
	public int getTotalRecords() {
		return totalRecords;
	}
	
	public ClubSet(List<Club> list, int totalRecords) {
		this.list=list;
		this.totalRecords=totalRecords;
	}

}
