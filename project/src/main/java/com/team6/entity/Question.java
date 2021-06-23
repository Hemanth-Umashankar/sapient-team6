package com.team6.entity;

import java.util.Date;

import com.team6.contracts.IPost;
import com.team6.contracts.Post;

public class Question extends Post{
	private int uid;
	private int qid;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	
}
