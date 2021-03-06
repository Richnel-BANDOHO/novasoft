package com.novasoft.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.novasoft.entity.Eleve;
import com.novasoft.entity.Paiements;
import com.novasoft.repository.EleveRepository;
import com.novasoft.repository.PaiementsRepository;

@Service
public class EleveService implements EleveServiceImpl{

	@Autowired
	EleveRepository eleveRepository;
	
	@Autowired
	PaiementsRepository paiementRepository;
	String codeEcole = "ALC";
	int annee = 21;	
	
	
	
	
	
	
	
	@Override
	public void addEleve(Eleve eleve) {
		Paiements paieOct = new Paiements("Aido", new Date(), 1, "Octobre");
		Paiements paieNov = new Paiements("Aido", new Date(), 1, "Novembre");
		Paiements paieDec = new Paiements("Aido", new Date(), 1, "Decembre");
		Paiements paieJan = new Paiements("Aido", new Date(), 1, "Janvier");
		Paiements paieFev = new Paiements("Aido", new Date(), 1, "Fevrier");
		Paiements paieMar = new Paiements("Aido", new Date(), 1, "Mars");
		Paiements paieAvr = new Paiements("Aido", new Date(), 1, "Avril");
		Paiements paieMai = new Paiements("Aido", new Date(), 1, "Mai");
		Paiements paieJuin = new Paiements("Aido", new Date(), 1, "Juin");
		
		
		
		List<Paiements> liste =  new ArrayList<Paiements>() ;
		liste.add(paieOct);
		liste.add(paieNov);
		liste.add(paieDec);
		liste.add(paieJan);
		liste.add(paieFev);
		liste.add(paieMar);
		liste.add(paieAvr);
		liste.add(paieMai);
		liste.add(paieJuin);
		long elevTabNumber = eleveRepository.count();
		
		
		if(elevTabNumber>=1) {
			
			long val = eleveRepository.maxEleveId();
			
			if(eleveRepository.maxEleveId()<10) {
				// Si il est inferieur a 10
				
				long newVal = val+1;
				eleve.setEleveMatricule(annee+codeEcole+"000"+newVal);
				eleve.setPaiements(liste);
				eleve.setInscriptionDate(new Date());
				
				eleveRepository.save(eleve);
			}else {
				
				//si sup??rieur ?? 10
				
				if(eleveRepository.maxEleveId()<100) {
					// superieur a 10 et inefrieur a 100, 10 ?? 99
					long newVal = val+1;
					eleve.setPaiements(liste);
					eleve.setEleveMatricule(annee+codeEcole+"00"+newVal);
					eleve.setInscriptionDate(new Date());
					
					eleveRepository.save(eleve);
				}else {
					//si superieur ?? 99 ; de 100 ?? linfinie
					
					if(eleveRepository.maxEleveId()<1000) {
						// si inferieur a 1000 de 100 ?? 999
						long newVal =val+1;
						eleve.setPaiements(liste);
						eleve.setEleveMatricule(annee+codeEcole+"0"+newVal);
						eleve.setInscriptionDate(new Date());
					
						eleveRepository.save(eleve);
						
					}else {
						//si superieur ?? 999; de 1000 ?? l'infinie
						if(eleveRepository.maxEleveId()<10000) {
							long newVal = val+1;
							eleve.setPaiements(liste);
							eleve.setEleveMatricule(annee+codeEcole+""+newVal);	
							eleve.setInscriptionDate(new Date());
							
						
							eleveRepository.save(eleve);
						}else {
							eleve.setPaiements(liste);
							eleve.setEleveMatricule(annee+codeEcole);
							eleve.setInscriptionDate(new Date());
							
							eleveRepository.save(eleve);
						}
					}
				}
				
			}
			
		}else {
			long newVal = elevTabNumber+1;
			eleve.setPaiements(liste);
			eleve.setEleveMatricule(annee+codeEcole+"000"+newVal);
			
			eleveRepository.save(eleve);
		}
		

	}
	
	

	@Override
	public void updateEleve(Eleve eleve , Long eleveId) {
		
		
		Eleve elev = eleveRepository.findById(eleveId).get();
	
		elev.setEleveName(eleve.getEleveName());
		elev.setEleveFirstName(eleve.getEleveFirstName());
		elev.setEleveBirthdate(eleve.getEleveBirthdate());
		elev.setEleveSexe(eleve.getEleveSexe());
		elev.setElevePlaceOfBirth(eleve.getElevePlaceOfBirth());
		elev.setElevePhoneNumber(eleve.getElevePhoneNumber());
		elev.setEleveClasse(eleve.getEleveClasse());
		elev.setEleveSerie(eleve.getEleveSerie());
		elev.setElevePassword(eleve.getElevePassword());
		elev.setEleveUserName(eleve.getEleveUserName());
		elev.setEleveAddress(eleve.getEleveAddress());
		
		
		
		eleveRepository.save(elev);
		
	}
	

	@Override
	public void deleteEleveById(Long id) {
		eleveRepository.deleteById(id);
		
	}

	@Override
	public List<Eleve> getAllEleve() {
		
		return (List<Eleve>) eleveRepository.findAll();
	}

	@Override
	public Eleve getEleveById(Long id) {
		return  eleveRepository.findById(id).get();
	}

	@Override
	public List<Eleve> findByTutorPhonenumber(String phoneNumber) {
		return eleveRepository.findByTutorPhonenumber(phoneNumber);
	}

	@Override
	public List<Eleve> findAllEleveByStudentLevel(String studentLevel){	
		return eleveRepository.findAllEleveByStudentLevel(studentLevel);
	}


//	@Override
//	public List<Eleve> findAllEleveByName(String eleveName) {
//		return eleveRepository.findAllEleveByName(eleveName);
//	}



	@Override
	public Eleve findEleveByMatricule(String elvMat) {
		return eleveRepository.findEleveByMatricule(elvMat);
	}



	@Override
	public Eleve maxEleveId() {
		
		return eleveRepository.findById((long) eleveRepository.maxEleveId()).get();
	}



	@Override
	public List<Eleve> searchEleve(String elveSearch) {
		return eleveRepository.searchEleve(elveSearch);
	}



	@Override
	public Paiements upDateElevePaiement(Long Eleveid, String mois, int montant) {
	
		List<Paiements> p = eleveRepository.findById(Eleveid).get().getPaiements();
		
		for (Paiements paie : p) {
			if(Objects.equals(paie.getMois(), mois)) {
				paie.setMontant(montant);
				paiementRepository.save(paie);
				
				return paiementRepository.findById(paie.getPaiementId()).get();
			}
		}
		
		return null;
		
	}



	@Override
	public Eleve getEleveByMatricule(String matricule) {
		
		return eleveRepository.getEleveByMatricule(matricule);
	}
	
}


