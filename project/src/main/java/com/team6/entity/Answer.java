package com.team6.entity;

import com.team6.contracts.Post;

public class Answer extends Post{
	private int aid;
	private int uid;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
}
