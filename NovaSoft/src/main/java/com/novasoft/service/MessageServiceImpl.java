package com.novasoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.novasoft.entity.Message;


@Service
public interface MessageServiceImpl {
	
	public void addMessage(Message message);
	public void deleteMessageById(Long messageId);
	public void updateMessage(Message message, Long messageId);
	
	public List<Message> getAllMessages();
	public Message getMessageById(Long messageId);
	

}
