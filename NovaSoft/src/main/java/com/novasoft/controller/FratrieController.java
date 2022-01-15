package com.novasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novasoft.entity.Fratrie;
import com.novasoft.service.FratrieServiceImpl;

@RestController
@RequestMapping("/fratrie")
public class FratrieController {
	
	@Autowired
	FratrieServiceImpl fratrieService;
	
	@PostMapping("/add")
	public void addFratrie(@RequestBody Fratrie fratrie) {
		fratrieService.addFratrie(fratrie);
	}

	
	@GetMapping("/all")
	public List<Fratrie> getAllFratrie() {
		return fratrieService.getAllFratrie();
	}
}
