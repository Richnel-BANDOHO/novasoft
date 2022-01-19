package com.novasoft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materiel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long materielId;
	private String materielName;
	private String statutMat;
	private String type;
	private String classeUtilsatrice;
	private String matUtilisateur;
	
	//private String etatMaterielle; bon état,moyen état, mauvais était

	public Materiel() {
		super();
	}

	public Materiel(String materielName, String statutMat, String type, String classeUtilsatrice,
			String matUtilisateur) {
		super();
		this.materielName = materielName;
		this.statutMat = statutMat;
		this.type = type;
		this.classeUtilsatrice = classeUtilsatrice;
		this.matUtilisateur = matUtilisateur;
	}




	public Long getMaterielId() {
		return materielId;
	}

	public void setMaterielId(Long materielId) {
		this.materielId = materielId;
	}

	public String getMaterielName() {
		return materielName;
	}

	public void setMaterielName(String materielName) {
		this.materielName = materielName;
	}

	public String getStatutMat() {
		return statutMat;
	}

	public void setStatutMat(String statutMat) {
		this.statutMat = statutMat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getClasseUtilsatrice() {
		return classeUtilsatrice;
	}

	public void setClasseUtilsatrice(String classeUtilsatrice) {
		this.classeUtilsatrice = classeUtilsatrice;
	}

	public String getMatUtilisateur() {
		return matUtilisateur;
	}

	public void setMatUtilisateur(String matUtilisateur) {
		this.matUtilisateur = matUtilisateur;
	}

	
		
}
