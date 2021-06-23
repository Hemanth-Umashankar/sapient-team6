package com.team6.entity;

import com.team6.contracts.Post;

public class Comment extends Post{
	private int uid;
	private int commentId;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
}
