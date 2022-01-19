package com.novasoft.entity;

import java.util.Date;

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
	private Date heurePris;
	private Date heurRemis;
	
	private String etatMaterielle;// bon état,moyen état, mauvais était
	private Date datedeModificationDelEtat;
	
	public Materiel() {
		super();
	}
	
	public Materiel(String materielName, String statutMat, String type, String classeUtilsatrice, String matUtilisateur,
			Date heurePris, Date heurRemis, String etatMaterielle, Date datedeModificationDelEtat) {
		super();
		this.materielName = materielName;
		this.statutMat = statutMat;
		this.type = type;
		this.classeUtilsatrice = classeUtilsatrice;
		this.matUtilisateur = matUtilisateur;
		this.heurePris = heurePris;
		this.heurRemis = heurRemis;
		this.etatMaterielle = etatMaterielle;
		this.datedeModificationDelEtat = datedeModificationDelEtat;
	}



	public Date getDatedeModificationDelEtat() {
		return datedeModificationDelEtat;
	}


	public void setDatedeModificationDelEtat(Date datedeModificationDelEtat) {
		this.datedeModificationDelEtat = datedeModificationDelEtat;
	}

	public String getEtatMaterielle() {
		return etatMaterielle;
	}



	public void setEtatMaterielle(String etatMaterielle) {
		this.etatMaterielle = etatMaterielle;
	}



	public Date getHeurePris() {
		return heurePris;
	}

	public void setHeurePris(Date heurePris) {
		this.heurePris = heurePris;
	}





	public Date getHeurRemis() {
		return heurRemis;
	}


	public void setHeurRemis(Date heurRemis) {
		this.heurRemis = heurRemis;
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
