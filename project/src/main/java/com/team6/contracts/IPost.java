package com.team6.contracts;

import java.util.Date;

public interface IPost {
	public void setContent(String content);
	public void setUpVotes(int upvote);
	public void setDownVotes(int downvotes);
	public void upvote();
	public void downvote();
	public void setCreationDate(Date date);
	public int getDownvotes();
	public int getUpvotes();
	public void editContent(String content);
}
