package com.novasoft.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novasoft.entity.Discussion;
import com.novasoft.service.DiscussionService;

@RestController
@RequestMapping("/Discussion")
public class DiscussionController {
	
	@Autowired
	DiscussionService discussionService;
	
	
	@PostMapping("/addDiscussion")
	public void addDiscussion(@RequestBody Discussion discussion) {
		discussion.setCreationDiscussionDate(new Date());
		discussionService.addDiscussion(discussion);
	}
	
	
	@DeleteMapping("/deleteDiscussion/{discussionId}")
	public void deleteDiscussionById(@PathVariable Long discussionId) {
		discussionService.deleteDiscussionById(discussionId);
	}
	
	@GetMapping("/getAll")
	public List<Discussion> getAllDiscussion(){
		
		return discussionService.getAllDiscussion();
	}
	
	@GetMapping("getDiscussion/{discussionId}")
	public Discussion getDiscussionById(@PathVariable Long discussionId) {
		return discussionService.getDiscussionById(discussionId);
	}

}
