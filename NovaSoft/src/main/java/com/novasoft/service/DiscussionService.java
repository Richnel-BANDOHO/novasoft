package com.novasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novasoft.entity.Discussion;
import com.novasoft.entity.Message;
import com.novasoft.repository.DiscussionRepository;

@Service
public class DiscussionService implements DiscussionServiceImpl {
	
	@Autowired
	DiscussionRepository discussionRepository;
	
	Message massage;

	
	@Override
	public void addDiscussion(Discussion discussion) {
		
		discussionRepository.save(discussion);
		
	}


	@Override
	public void deleteDiscussionById(Long discussionId) {
		
		discussionRepository.deleteById(discussionId);
		
	}


	@Override
	public List<Discussion> getAllDiscussion() {
		return (List<Discussion>) discussionRepository.findAll();
	}


	@Override
	public Discussion getDiscussionById(Long discussionId) {
		
		return discussionRepository.findById(discussionId).get();
	}



	@Override
	public void addMessageToTheDiscussion(List<Message>  message, Long discussionId) {
		
		Discussion discussion =  discussionRepository.findById(discussionId).get();
		discussion.setMessage(message);
		discussionRepository.save(discussion);
		
	}
	
	
	
	
}
