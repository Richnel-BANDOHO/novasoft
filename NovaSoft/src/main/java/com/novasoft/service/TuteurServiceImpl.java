package com.novasoft.service;

import java.util.List;

import com.novasoft.entity.Tuteur;

public interface TuteurServiceImpl {

	public void addTuteur(Tuteur tuteur);
	public void updateTuteur(Tuteur tuteur, Long tuteurId);
	public void deleteTuteurById(Long id);
	public List<Tuteur> getAllTuteur();
	public Tuteur getTuteurById(Long id);

}
