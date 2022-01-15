package com.novasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.novasoft.entity.ObjetSaisie;
import com.novasoft.service.ObjetSaisieService;
import com.novasoft.service.ObjetSaisieServiceImpl;

@RestController
@RequestMapping("/ObjetSaisi")
public class ObjetSaisieController {
	
	
	@Autowired
	ObjetSaisieService objetSaisieService; 
	
	
	@PostMapping("/add")
	public void AjouterObjetSaisie(@RequestBody ObjetSaisie objetSaisie) {
		 objetSaisieService.AddObjetSaisie(objetSaisie);
	}
	

}
