package com.novasoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novasoft.entity.Fratrie;
import com.novasoft.repository.FratrieRepository;

@Service
public class FratrieService  implements FratrieServiceImpl{

	
	@Autowired
	FratrieRepository fratrieRepository;
	
	@Override
	public void addFratrie(Fratrie fratrie) {
		
		fratrieRepository.save(fratrie);
		
	}

	@Override
	public Fratrie getFratrie(Long id) {
		
		return fratrieRepository.findById(id).get();
		
	}

	@Override
	public List<Fratrie> getAllFratrie() {
		
		return (List<Fratrie>) fratrieRepository.findAll();
	}

}
