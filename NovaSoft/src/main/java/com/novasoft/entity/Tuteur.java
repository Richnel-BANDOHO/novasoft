package com.novasoft.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Tuteur extends User implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
	

	private String tuteurAdress;
	private String tuteurPhoneNumber;
	private String tuteurEmail;
	private String tuteurPassword;
	private String tuteurUserName;
	private String tuteurDadName;
	private String tuteurMomName;
	private String tuteurProfession;
	
	public Tuteur() {
		super();
	}
	public Tuteur(String tuteurAdress, String tuteurPhoneNumber, String tuteurEmail, String tuteurPassword,
			String tuteurUserName, String tuteurDadName, String tuteurMomName, String tuteurProfession) {
		super();
		this.tuteurAdress = tuteurAdress;
		this.tuteurPhoneNumber = tuteurPhoneNumber;
		this.tuteurEmail = tuteurEmail;
		this.tuteurPassword = tuteurPassword;
		this.tuteurUserName = tuteurUserName;
		this.tuteurDadName = tuteurDadName;
		this.tuteurMomName = tuteurMomName;
		this.tuteurProfession = tuteurProfession;
	}
	public String getTuteurAdress() {
		return tuteurAdress;
	}
	public void setTuteurAdress(String tuteurAdress) {
		this.tuteurAdress = tuteurAdress;
	}
	public String getTuteurPhoneNumber() {
		return tuteurPhoneNumber;
	}
	public void setTuteurPhoneNumber(String tuteurPhoneNumber) {
		this.tuteurPhoneNumber = tuteurPhoneNumber;
	}
	public String getTuteurEmail() {
		return tuteurEmail;
	}
	public void setTuteurEmail(String tuteurEmail) {
		this.tuteurEmail = tuteurEmail;
	}
	public String getTuteurPassword() {
		return tuteurPassword;
	}
	public void setTuteurPassword(String tuteurPassword) {
		this.tuteurPassword = tuteurPassword;
	}
	public String getTuteurUserName() {
		return tuteurUserName;
	}
	public void setTuteurUserName(String tuteurUserName) {
		this.tuteurUserName = tuteurUserName;
	}
	public String getTuteurDadName() {
		return tuteurDadName;
	}
	public void setTuteurDadName(String tuteurDadName) {
		this.tuteurDadName = tuteurDadName;
	}
	public String getTuteurMomName() {
		return tuteurMomName;
	}
	public void setTuteurMomName(String tuteurMomName) {
		this.tuteurMomName = tuteurMomName;
	}
	public String getTuteurProfession() {
		return tuteurProfession;
	}
	public void setTuteurProfession(String tuteurProfession) {
		this.tuteurProfession = tuteurProfession;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "eleveId")
//	public List<Eleve> eleve ;
	
	
	
	
}
