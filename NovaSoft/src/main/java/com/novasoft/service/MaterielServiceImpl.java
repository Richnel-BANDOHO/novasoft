package com.novasoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.novasoft.entity.Materiel;

@Service
public interface MaterielServiceImpl {
	//type,materielName,etatMaterielle
	public void addMateriel(Materiel materiel);
	public void deleteMaterielById(int mateirelId);
	public Materiel modifyMateriel(String type,String materielName, String etatMateriel, Long id);
	public Materiel modifyStatut(Long matId,String matUser);
	public List<Materiel> retrieveAllMateriel();

}
