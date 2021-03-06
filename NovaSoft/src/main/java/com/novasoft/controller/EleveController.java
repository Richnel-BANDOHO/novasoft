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

import com.novasoft.entity.Eleve;
import com.novasoft.entity.Paiements;
import com.novasoft.service.EleveService;


@RestController
@RequestMapping("/eleve")
public class EleveController {
	
	
	@Autowired
	EleveService eleveService;

	
	@PostMapping("/add")
	public void addEleve(@RequestBody Eleve eleve) {
		List<Paiements> paiements;
	
		eleveService.addEleve(eleve);
	}

	@PutMapping("update/{eleveId}")
	public void updateEleve(@RequestBody Eleve eleve , @PathVariable("eleveId") Long eleveId) {

		eleveService.updateEleve(eleve, eleveId);
		
	}
	
	
	@GetMapping("/all")
	public List<Eleve> getAllEleve(){
		
		return eleveService.getAllEleve();
	}
	
	@GetMapping("/{eleveId}")
	public Eleve getEleveById(@PathVariable("eleveId") Long eleveId) {
		
		return eleveService.getEleveById(eleveId);
		
	}
	
	@GetMapping("/tuteur/{tuteurPhoneNumber}")
	public List<Eleve> findByTutorPhonenumber(@PathVariable("tuteurPhoneNumber") String tuteurPhoneNumber) {
				
		return eleveService.findByTutorPhonenumber(tuteurPhoneNumber);
	}
	
	@GetMapping("/allEleveByLevel/{studentLevel}")
	public List<Eleve> findAllEleveByStudentLevel(@PathVariable String studentLevel){
		return eleveService.findAllEleveByStudentLevel(studentLevel);
	}
//	@GetMapping("/AllEleveByName/{eleveName}")
//	public List<Eleve> findAllEleveByName(@PathVariable String eleveName) {
//		return eleveService.findAllEleveByName(eleveName);
//	}
	
	@GetMapping("/findByEleveMatricule/{elevMat}")
	public Eleve findEleveByMatricule(@PathVariable String elevMat) {
		return eleveService.findEleveByMatricule(elevMat);
	}
	
	@GetMapping("/LastEleveId")
	public Eleve findLastEleveId() {
		
		return eleveService.maxEleveId();
	}
	
	@GetMapping("/Search/{elveSearch}")
	public List<Eleve> searchEleve(@PathVariable String elveSearch){
		return eleveService.searchEleve(elveSearch);
	}
	
	@GetMapping("/SearchByMatricule/{matricule}")
	public Eleve getEleveByMatricule(@PathVariable String matricule){	
		return eleveService.getEleveByMatricule(matricule);
	}
	
	
	
//	@PutMapping("elevePaiement/{eleveId}/{montant}")
//	public void addElevePaiementById( @PathVariable int montant, @PathVariable Long eleveId) {
//		eleveService.addElevePaiementById(montant, eleveId);
//	}
}
