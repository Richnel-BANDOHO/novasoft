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
import com.novasoft.service.PaiementsService;

@RestController
@RequestMapping("/Paiement")
public class PaiementController {
	
	
	@Autowired
	PaiementsService paiementService;
	
	@Autowired
	EleveService eleveService;
	
	@PostMapping("/add")
	public void addPaiement(@RequestBody Paiements paiement) {
		paiementService.addPaiement(paiement);
		
	}
	
	@GetMapping("/all")
	public List<Paiements> getAllpaiements(){
		return paiementService.getAllpaiements();
	}
	
	@GetMapping("/update/{eleveId}/{mois}/{montant}")
	public Paiements upDateElevePaiement(@PathVariable Long eleveId,@PathVariable String mois,@PathVariable int montant) {
		return eleveService.upDateElevePaiement(eleveId, mois, montant);
	}
	
	@GetMapping("/getPaiementWithMont/{elevId}/{month}")
	public Paiements getPaiementByIdWithMonth(@PathVariable Long elevId, @PathVariable String month) {
		return paiementService.getPaiementByIdWithMonth(elevId, month);
	}

}
