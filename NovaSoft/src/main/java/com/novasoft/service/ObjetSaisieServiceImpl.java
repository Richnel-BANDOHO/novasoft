package com.novasoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.novasoft.entity.ObjetSaisie;

@Service
public interface ObjetSaisieServiceImpl {
	
	public void AddObjetSaisie(ObjetSaisie objetSaisie);
	public List<ObjetSaisie> getAllObjetSaisi();
	public ObjetSaisie getObjetSaisiById(Long id);

}
