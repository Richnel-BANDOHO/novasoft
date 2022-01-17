package com.novasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.novasoft.entity.Materiel;
import com.novasoft.service.MaterielService;

@RestController("/Materiel")
public class MaterielController {
	
	
	@Autowired
	MaterielService materielService; 
	
	@PostMapping("/add")
	public void addMateriel(@RequestBody Materiel materiel) {
		materielService.addMateriel(materiel);
	}
	

}
