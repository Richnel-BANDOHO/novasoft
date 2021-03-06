package com.novasoft.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novasoft.entity.ObjetSaisie;
import com.novasoft.repository.ObjetSaisieRepository;

@Service
public class ObjetSaisieService implements ObjetSaisieServiceImpl{
	
	@Autowired
	ObjetSaisieRepository objetSaisieRepository; 

	@Override
	public void AddObjetSaisie(ObjetSaisie objetSaisi) {
		
		objetSaisi.setDateDeSaisie(new Date());
		objetSaisi.setIsRestitue(false);
		objetSaisieRepository.save(objetSaisi);
		
	}

	@Override
	public List<ObjetSaisie> getAllObjetSaisi() {
		
		return objetSaisieRepository.findAll();
	}

	@Override
	public ObjetSaisie getObjetSaisiById(Long id) {
		
		return objetSaisieRepository.findById(id).get();
	}

}
