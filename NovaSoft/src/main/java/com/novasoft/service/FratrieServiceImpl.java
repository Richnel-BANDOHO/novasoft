package com.novasoft.service;

import java.util.List;

import com.novasoft.entity.Fratrie;

public interface FratrieServiceImpl {

	public void addFratrie(Fratrie fratrie);
	public Fratrie getFratrie(Long id);
	public List<Fratrie> getAllFratrie();
	
}
