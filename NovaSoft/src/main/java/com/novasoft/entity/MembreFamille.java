package com.novasoft.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MembreFamille {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long membreFamilleId;
	// private lien de parenté, soeur, frere, cousin

	public Long getMembreFamilleId() {
		return membreFamilleId;
	}

	public void setMembreFamilleId(Long membreFamilleId) {
		this.membreFamilleId = membreFamilleId;
	}

	public MembreFamille() {
		super();
	}
		
}