package com.novasoft.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fratrie implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long fratrieId;
	private Long membreFamilleId;
	private String LienDeParente ;
	private String classeMembrFam;
	
	
	
	
	public Fratrie(Long membreFamilleId, String lienDeParente, String classeMembrFam) {
		super();
		this.membreFamilleId = membreFamilleId;
		LienDeParente = lienDeParente;
		this.classeMembrFam = classeMembrFam;
	}
	
	public String getClasseMembrFam() {
		return classeMembrFam;
	}
	public void setClasseMembrFam(String classeMembrFam) {
		this.classeMembrFam = classeMembrFam;
	}
	public String getLienDeParente() {
		return LienDeParente;
	}
	public void setLienDeParente(String lienDeParente) {
		LienDeParente = lienDeParente;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getFratrieId() {
		return fratrieId;
	}
	public void setFratrieId(Long fratrieId) {
		this.fratrieId = fratrieId;
	}
	public Long getMembreFamilleId() {
		return membreFamilleId;
	}
	public void setMembreFamilleId(Long membreFamilleId) {
		this.membreFamilleId = membreFamilleId;
	}
	
	
	
	
	
	public Fratrie() {
		super();
	}
	
	
	
	

}
