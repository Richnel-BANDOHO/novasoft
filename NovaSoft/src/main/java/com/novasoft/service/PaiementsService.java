package com.novasoft.service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.novasoft.entity.Paiements;
import com.novasoft.repository.EleveRepository;
import com.novasoft.repository.PaiementsRepository;

@Service
public class PaiementsService implements PaiementsServiceImpl {

	
	@Autowired
	PaiementsRepository paiementRepository;
	
	@Autowired
	EleveRepository eleveRepository;
	
	@Override
	public void addPaiement(Paiements paiement) {
		 paiement.setDatePaiement(new Date());
		paiementRepository.save(paiement);
	}

	@Override
	public List<Paiements> getAllpaiements() {	
			return (List<Paiements>) paiementRepository.findAll();
		
	}

	@Override
	public Paiements getPaiementByIdWithMonth(Long elevId, String month) {
		List<Paiements> p = eleveRepository.findById(elevId).get().getPaiements();
		
		for (Paiements paie : p) {
			if(Objects.equals(paie.getMois(), month)) {

				return paiementRepository.findById(paie.getPaiementId()).get();
			}
		}
		return null;
	}

}
