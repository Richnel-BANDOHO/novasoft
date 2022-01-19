package com.novasoft.service;

import java.util.Date;
import java.util.List;

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
		materiel.setStatutMat("Rendu");
		materiel.setDatedeModificationDelEtat(new Date());
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
	public Materiel modifyStatut(Long matId, String matUser) {
		
		Materiel mat = materielRepository.findById(matId).get();
		
		if ("En utilisation".equals(mat.getStatutMat())) {
			
			mat.setStatutMat("Rendu");
			mat.setHeurRemis(new Date());
			
			materielRepository.save(mat);
			return mat;
		}else{
			mat.setStatutMat("En utilisation");
			mat.setHeurePris(new Date());
			mat.setMatUtilisateur(matUser);
			materielRepository.save(mat);
			return mat;
		}
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMaterielById(int mateirelId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Materiel> retrieveAllMateriel() {
		
		return materielRepository.findAll();
	}
	
	

}
