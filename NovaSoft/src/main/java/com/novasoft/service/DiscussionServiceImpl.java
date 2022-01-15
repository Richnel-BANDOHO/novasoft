package com.novasoft.service;

import java.util.List;

import com.novasoft.entity.Discussion;
import com.novasoft.entity.Message;

public interface DiscussionServiceImpl {

	public void addDiscussion(Discussion discussion);
	
	public void deleteDiscussionById(Long discussionId);
	
	public List<Discussion> getAllDiscussion();
	
	public Discussion getDiscussionById(Long discussionId);
	
	public void addMessageToTheDiscussion(List<Message> message, Long discussionId);
	
	
	
}
