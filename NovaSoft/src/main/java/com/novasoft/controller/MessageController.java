package com.novasoft.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novasoft.entity.Message;
import com.novasoft.service.MessageService;

@RestController
@RequestMapping("Message")
public class MessageController {
	
	@Autowired
	MessageService messageService;

	@PostMapping("/add")
	public void addMessage(@RequestBody Message message) {
		
		messageService.addMessage(message);
	}
	
	@DeleteMapping("/delete/{messageId}")
	public void deleteMessageById(@PathVariable("messageId") Long messageId) {
		messageService.deleteMessageById(messageId);
	}
	
	@PutMapping("/update/{messageId}")
	public void updateMessage(@PathVariable("messageId") Long messageId, @RequestBody Message message) {
		messageService.updateMessage(message, messageId);
		
	}
	
	
	
}
