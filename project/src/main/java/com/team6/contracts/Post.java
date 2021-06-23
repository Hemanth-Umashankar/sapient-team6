package com.team6.contracts;

import java.util.Date;

public abstract class Post{
	private String content;
	private Date createdDate;
	private int uid;
	private int upvotes;
	private int donwvotes;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getUpvotes() {
		return upvotes;
	}
	public void setUpvotes(int upvotes) {
		this.upvotes = upvotes;
	}
	public int getDonwvotes() {
		return donwvotes;
	}
	public void setDonwvotes(int donwvotes) {
		this.donwvotes = donwvotes;
	}
	public void editContent(String content) {
		this.content= content;
	}
	public void upvote() {}
	public void downvote() {}
	
	

}
