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

import com.novasoft.entity.Materiel;
import com.novasoft.service.MaterielService;

@RestController
@RequestMapping("/Materiel")
public class MaterielController {
	
	
	@Autowired
	MaterielService materielService; 
	
	@PostMapping("/add")
	public void addMateriel(@RequestBody Materiel materiel) {
		materielService.addMateriel(materiel);
	}
	
	@PutMapping("/modifyStatut/{matId}/{matUser}")
	public Materiel modifyStatut(@PathVariable("matId") Long matId,  @PathVariable("matUser") String matUser) {
		return materielService.modifyStatut(matId,matUser);
		
	}
	
	
	@GetMapping("/all")
	public List<Materiel> retrieveAllMateriel() {
		return materielService.retrieveAllMateriel();
		
	}
	
	

}
