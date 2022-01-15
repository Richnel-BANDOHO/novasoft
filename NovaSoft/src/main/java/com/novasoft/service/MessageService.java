package com.novasoft.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novasoft.entity.Message;
import com.novasoft.repository.MessageRepository;

@Service
public class MessageService implements MessageServiceImpl {

	@Autowired
	MessageRepository messageRepository;
	
	@Override
	public void addMessage(Message message) {
		message.setCreatedAt(new Date());
		messageRepository.save(message);
	}

	@Override
	public void deleteMessageById(Long messageId) {
		messageRepository.deleteById(messageId);
	}

	@Override
	public void updateMessage(Message message, Long messageId) {
		Message mess = messageRepository.findById(messageId).get();
		mess.setMessageContent(message.getMessageContent());
		messageRepository.save(mess);
	}

	@Override
	public List<Message> getAllMessages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message getMessageById(Long messageId) {
		
		return messageRepository.findById(messageId).get();
	}
	
	
	
}
