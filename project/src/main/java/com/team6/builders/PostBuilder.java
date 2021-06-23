package com.team6.builders;


import com.team6.contracts.Post;
import com.team6.entity.Answer;
import com.team6.entity.Comment;
import com.team6.entity.Question;

enum ContentType{
	QUESTION,
	ANSWER,
	COMMENT
}

public class PostBuilder {
	private PostBuilder() {}
	public static Post buildContent(String contentType) {
		Post post;
		if(contentType.equalsIgnoreCase("Questions"))
			return new Question();
		if(contentType.equalsIgnoreCase("Answers"))
			return new Answer();
		if(contentType.equalsIgnoreCase("Comment"))
			return new Comment();
		return null;

	}
}

