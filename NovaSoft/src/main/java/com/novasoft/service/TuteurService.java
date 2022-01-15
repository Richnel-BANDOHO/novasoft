package com.novasoft.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novasoft.entity.Tuteur;
import com.novasoft.repository.TuteurRepository;


@Service
public class TuteurService implements TuteurServiceImpl {

	
	@Autowired
	TuteurRepository tuteurRepository;
	
	
	@Override
	public void addTuteur(Tuteur tuteur) {
		tuteurRepository.save(tuteur);
	}

	
	@Override
	public void updateTuteur(Tuteur tuteur, Long tuteurId) {
		tuteurRepository.save(tuteur);	
	}

	@Override
	public void deleteTuteurById(Long id) {
		tuteurRepository.deleteById(id);
	}

	@Override
	public List<Tuteur> getAllTuteur() {
		// TODO Auto-generated method stub
		return (List<Tuteur>) tuteurRepository.findAll();
	}

	@Override
	public Tuteur getTuteurById(Long id) {
		
		return tuteurRepository.findById(id).get();
	}
	

	
}
