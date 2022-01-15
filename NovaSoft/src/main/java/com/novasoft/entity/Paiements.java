package com.novasoft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Paiements implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long paiementId;

	private String auteur;
	private Date datePaiement;

	private int montant;
	
	private String mois;
	
	
	public int getMontant() {
		return montant;
	}

	public Paiements(String auteur, Date datePaiement, int montant, String mois) {
		super();
		this.auteur = auteur;
		this.datePaiement = datePaiement;
		this.montant = montant;
		this.mois = mois;
	}
	
	



	public Paiements(String mois) {
		super();
		List<Paiements> p;
		
		this.auteur = "";
		this.datePaiement = new Date();
		this.montant = 1;
		this.mois = mois;
	}

	@Override
	public String toString() {
		return "Paiements [auteur=" + auteur + ", datePaiement=" + datePaiement + ", montant=" + montant + ", mois="
				+ mois + "]";
	}





	public void setMontant(int montant) {
		this.montant = montant;
	}



	public Paiements() {
		super();
	}



	public Long getPaiementId() {
		return paiementId;
	}

	public void setPaiementId(Long paiementId) {
		this.paiementId = paiementId;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}




	public String getMois() {
		return mois;
	}

	public void setMois(String mois) {
		this.mois = mois;
	}
	
	
	

}
