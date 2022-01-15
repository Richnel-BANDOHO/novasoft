package com.novasoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.novasoft.entity.Paiements;

@Service
public interface PaiementsServiceImpl {

	
	public void addPaiement(Paiements paiement);
	public List<Paiements> getAllpaiements();
	public Paiements getPaiementByIdWithMonth(Long elevId, String month);
}
