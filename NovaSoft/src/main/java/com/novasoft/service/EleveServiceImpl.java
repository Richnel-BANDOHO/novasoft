package com.novasoft.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.novasoft.entity.Eleve;
import com.novasoft.entity.Paiements;

public interface EleveServiceImpl {
	
	public void addEleve(Eleve eleve);
	public void updateEleve(Eleve eleve, Long eleveId);
	public void deleteEleveById(Long id);
	public List<Eleve> getAllEleve();
	public Eleve getEleveById(Long id);
	public List<Eleve> findByTutorPhonenumber(String phoneNumber);
	
	public List<Eleve> findAllEleveByStudentLevel(String eleveClasse);
	//public List<Eleve> findAllEleveByName(String eleveName);
	public Eleve findEleveByMatricule(String elvMat);
	public Eleve maxEleveId();
	public List<Eleve> searchEleve(String elveSearch);
	public Paiements upDateElevePaiement(Long Eleveid, String mois,int montant);
	
	public Eleve getEleveByMatricule(String matricule);

}
