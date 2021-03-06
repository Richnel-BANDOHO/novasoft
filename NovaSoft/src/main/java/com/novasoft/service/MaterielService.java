package com.novasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novasoft.entity.Materiel;
import com.novasoft.repository.MaterielRepository;

@Service
public class MaterielService implements MaterielServiceImpl{

	@Autowired
	MaterielRepository materielRepository; 
	
	@Override
	public void addMateriel(Materiel materiel) {
		materielRepository.save(materiel);
	}

//	@Override
//	public void deleteMaterielById(int materielId) {
//		materielRepository.deleteById(materielId);
//	}

	@Override
	public void modifyMateriel(Materiel materiel, Long materielId) {
		Materiel mat = materielRepository.findById(materielId).get();
		mat.setMaterielName(materiel.getMaterielName());
		mat.setStatutMat(materiel.getStatutMat());
		mat.setType(materiel.getType());
		
	}

	@Override
	public void modifyStatut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMaterielById(int mateirelId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
