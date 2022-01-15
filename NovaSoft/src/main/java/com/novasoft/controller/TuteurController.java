package com.novasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novasoft.entity.Tuteur;
import com.novasoft.service.TuteurService;

@RestController
@RequestMapping("/Tuteur")
public class TuteurController {
	
	@Autowired
	TuteurService tuteurService;

	
	
	
	@PostMapping("/add")
	public void addTuteur(@RequestBody Tuteur tuteur) {
		tuteurService.addTuteur(tuteur);
	}

	@PutMapping("update/{tuteurId}")
	public void updateTuteur(@RequestBody Tuteur tuteur , @PathVariable("tuteurId") Long tuteurId) {

		tuteurService.updateTuteur(tuteur, tuteurId);
		
	}
	
	
	@GetMapping("/all")
	public List<Tuteur> getAllTuteur(){
		
		return tuteurService.getAllTuteur();
	}
	
	
	@GetMapping("/{tuteurId}")
	public Tuteur getTuteurById(@PathVariable("tuteurId") Long tuteurId) {
		
		return tuteurService.getTuteurById(tuteurId);
		
	}

}
