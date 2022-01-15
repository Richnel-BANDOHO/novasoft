package com.novasoft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * @author Aido
 *
 */


@Entity
public class Eleve implements Serializable{
	
	//Ajouter une variable monatant a payer
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eleveId;
	
	private String eleveName;
	
	private String eleveFirstName ;
	
	private Date eleveBirthdate ;
	
	private String eleveSexe ;
	
	private String elevePlaceOfBirth;
	
	private String eleveAddress;
	
	private String elevePhoneNumber;
	
	private String eleveClasse;
	
	private Date inscriptionDate;
	
	private String  eleveMatricule;
	
	private int lastMatricule;
	
	
	public int getLastMatricule() {
		return lastMatricule;
	}



	public void setLastMatricule(int lastMatricule) {
		this.lastMatricule = lastMatricule;
	}



	public String getEleveMatricule() {
		return eleveMatricule;
	}



	public void setEleveMatricule(String eleveMatricule) {
		this.eleveMatricule = eleveMatricule;
	}

	private String eleveSerie;
	
	@JsonIgnore
	private String elevePassword; 
	private String eleveUserName;
	
	private String eleveDadName;
	private String eleveDadFirstname;
	private String eleveDadCinNum;
	private String eleveDadProfession;
	private String eleveDadResidence;
	private String eleveDadPhoneNum;
	
	private String eleveMomName;
	private String eleveMomFirstname;
	private String eleveMomCinNum;
	private String eleveMomProfession;
	private String eleveMomResidence;
	private String eleveMomPhoneNum;
	
	private String eleveTutorName;
	private String eleveTutorFirstname;
	private String eleveTutorCinNum;
	private String eleveTutorProfession;
	private String eleveTutorResidence;
	private String eleveTutorPhoneNum;

	public Eleve(String eleveName, String eleveFirstName, Date eleveBirthdate, String eleveSexe,
			String elevePlaceOfBirth, String eleveAddress, String elevePhoneNumber, String eleveClasse,
			Date inscriptionDate, String eleveMatricule, int lastMatricule, String eleveSerie, String elevePassword,
			String eleveUserName, String eleveDadName, String eleveDadFirstname, String eleveDadCinNum,
			String eleveDadProfession, String eleveDadResidence, String eleveDadPhoneNum, String eleveMomName,
			String eleveMomFirstname, String eleveMomCinNum, String eleveMomProfession, String eleveMomResidence,
			String eleveMomPhoneNum, String eleveTutorName, String eleveTutorFirstname, String eleveTutorCinNum,
			String eleveTutorProfession, String eleveTutorResidence, String eleveTutorPhoneNum,
			List<Paiements> paiements, List<Fratrie> fratrie) {
		super();
		this.eleveName = eleveName;
		this.eleveFirstName = eleveFirstName;
		this.eleveBirthdate = eleveBirthdate;
		this.eleveSexe = eleveSexe;
		this.elevePlaceOfBirth = elevePlaceOfBirth;
		this.eleveAddress = eleveAddress;
		this.elevePhoneNumber = elevePhoneNumber;
		this.eleveClasse = eleveClasse;
		this.inscriptionDate = inscriptionDate;
		this.eleveMatricule = eleveMatricule;
		this.lastMatricule = lastMatricule;
		this.eleveSerie = eleveSerie;
		this.elevePassword = elevePassword;
		this.eleveUserName = eleveUserName;
		this.eleveDadName = eleveDadName;
		this.eleveDadFirstname = eleveDadFirstname;
		this.eleveDadCinNum = eleveDadCinNum;
		this.eleveDadProfession = eleveDadProfession;
		this.eleveDadResidence = eleveDadResidence;
		this.eleveDadPhoneNum = eleveDadPhoneNum;
		this.eleveMomName = eleveMomName;
		this.eleveMomFirstname = eleveMomFirstname;
		this.eleveMomCinNum = eleveMomCinNum;
		this.eleveMomProfession = eleveMomProfession;
		this.eleveMomResidence = eleveMomResidence;
		this.eleveMomPhoneNum = eleveMomPhoneNum;
		this.eleveTutorName = eleveTutorName;
		this.eleveTutorFirstname = eleveTutorFirstname;
		this.eleveTutorCinNum = eleveTutorCinNum;
		this.eleveTutorProfession = eleveTutorProfession;
		this.eleveTutorResidence = eleveTutorResidence;
		this.eleveTutorPhoneNum = eleveTutorPhoneNum;
		this.paiements = paiements;
		this.fratrie = fratrie;
	}



	public Long getEleveId() {
		return eleveId;
	}



	public void setEleveId(Long eleveId) {
		this.eleveId = eleveId;
	}



	public Eleve() {
		super();
	}

	
	public String getEleveName() {
		return eleveName;
	}
	
	public void setEleveName(String eleveName) {
		this.eleveName = eleveName;
	}

	public String getEleveFirstName() {
		return eleveFirstName;
	}

	public void setEleveFirstName(String eleveFirstName) {
		this.eleveFirstName = eleveFirstName;
	}

	public Date getEleveBirthdate() {
		return eleveBirthdate;
	}

	public void setEleveBirthdate(Date eleveBirthdate) {
		this.eleveBirthdate = eleveBirthdate;
	}

	public String getEleveSexe() {
		return eleveSexe;
	}

	public void setEleveSexe(String eleveSexe) {
		this.eleveSexe = eleveSexe;
	}

	public String getElevePlaceOfBirth() {
		return elevePlaceOfBirth;
	}

	public void setElevePlaceOfBirth(String elevePlaceOfBirth) {
		this.elevePlaceOfBirth = elevePlaceOfBirth;
	}

	public String getEleveAddress() {
		return eleveAddress;
	}

	public void setEleveAddress(String eleveAddress) {
		this.eleveAddress = eleveAddress;
	}

	public String getElevePhoneNumber() {
		return elevePhoneNumber;
	}

	public void setElevePhoneNumber(String elevePhoneNumber) {
		this.elevePhoneNumber = elevePhoneNumber;
	}

	public String getEleveClasse() {
		return eleveClasse;
	}

	public void setEleveClasse(String eleveClasse) {
		this.eleveClasse = eleveClasse;
	}

	public Date getInscriptionDate() {
		return inscriptionDate;
	}

	public void setInscriptionDate(Date inscriptionDate) {
		this.inscriptionDate = inscriptionDate;
	}

	public String getEleveSerie() {
		return eleveSerie;
	}

	public void setEleveSerie(String eleveSerie) {
		this.eleveSerie = eleveSerie;
	}

	public String getElevePassword() {
		return elevePassword;
	}

	public void setElevePassword(String elevePassword) {
		this.elevePassword = elevePassword;
	}

	public String getEleveUserName() {
		return eleveUserName;
	}

	public void setEleveUserName(String eleveUserName) {
		this.eleveUserName = eleveUserName;
	}

	public String getEleveDadName() {
		return eleveDadName;
	}

	public void setEleveDadName(String eleveDadName) {
		this.eleveDadName = eleveDadName;
	}

	public String getEleveDadFirstname() {
		return eleveDadFirstname;
	}

	public void setEleveDadFirstname(String eleveDadFirstname) {
		this.eleveDadFirstname = eleveDadFirstname;
	}

	public String getEleveDadCinNum() {
		return eleveDadCinNum;
	}

	public void setEleveDadCinNum(String eleveDadCinNum) {
		this.eleveDadCinNum = eleveDadCinNum;
	}

	public String getEleveDadProfession() {
		return eleveDadProfession;
	}

	public void setEleveDadProfession(String eleveDadProfession) {
		this.eleveDadProfession = eleveDadProfession;
	}

	public String getEleveDadResidence() {
		return eleveDadResidence;
	}

	public void setEleveDadResidence(String eleveDadResidence) {
		this.eleveDadResidence = eleveDadResidence;
	}

	public String getEleveDadPhoneNum() {
		return eleveDadPhoneNum;
	}

	public void setEleveDadPhoneNum(String eleveDadPhoneNum) {
		this.eleveDadPhoneNum = eleveDadPhoneNum;
	}

	public String getEleveMomName() {
		return eleveMomName;
	}

	public void setEleveMomName(String eleveMomName) {
		this.eleveMomName = eleveMomName;
	}

	public String getEleveMomFirstname() {
		return eleveMomFirstname;
	}

	public void setEleveMomFirstname(String eleveMomFirstname) {
		this.eleveMomFirstname = eleveMomFirstname;
	}

	public String getEleveMomCinNum() {
		return eleveMomCinNum;
	}

	public void setEleveMomCinNum(String eleveMomCinNum) {
		this.eleveMomCinNum = eleveMomCinNum;
	}

	public String getEleveMomProfession() {
		return eleveMomProfession;
	}

	public void setEleveMomProfession(String eleveMomProfession) {
		this.eleveMomProfession = eleveMomProfession;
	}

	public String getEleveMomResidence() {
		return eleveMomResidence;
	}

	public void setEleveMomResidence(String eleveMomResidence) {
		this.eleveMomResidence = eleveMomResidence;
	}

	public String getEleveMomPhoneNum() {
		return eleveMomPhoneNum;
	}

	public void setEleveMomPhoneNum(String eleveMomPhoneNum) {
		this.eleveMomPhoneNum = eleveMomPhoneNum;
	}

	public String getEleveTutorName() {
		return eleveTutorName;
	}

	public void setEleveTutorName(String eleveTutorName) {
		this.eleveTutorName = eleveTutorName;
	}

	public String getEleveTutorFirstname() {
		return eleveTutorFirstname;
	}

	public void setEleveTutorFirstname(String eleveTutorFirstname) {
		this.eleveTutorFirstname = eleveTutorFirstname;
	}

	public String getEleveTutorCinNum() {
		return eleveTutorCinNum;
	}

	public void setEleveTutorCinNum(String eleveTutorCinNum) {
		this.eleveTutorCinNum = eleveTutorCinNum;
	}

	public String getEleveTutorProfession() {
		return eleveTutorProfession;
	}

	public void setEleveTutorProfession(String eleveTutorProfession) {
		this.eleveTutorProfession = eleveTutorProfession;
	}

	public String getEleveTutorResidence() {
		return eleveTutorResidence;
	}

	public void setEleveTutorResidence(String eleveTutorResidence) {
		this.eleveTutorResidence = eleveTutorResidence;
	}

	public String getEleveTutorPhoneNum() {
		return eleveTutorPhoneNum;
	}

	public void setEleveTutorPhoneNum(String eleveTutorPhoneNum) {
		this.eleveTutorPhoneNum = eleveTutorPhoneNum;
	}

	public List<Paiements> getPaiements() {
		return paiements;
	}

	public void setPaiements(List<Paiements> paiements) {
		
		this.paiements = paiements;
	}

	public List<Fratrie> getFratrie() {
		return fratrie;
	}

	public void setFratrie(List<Fratrie> fratrie) {
		this.fratrie = fratrie;
	}

	@OneToMany(cascade = CascadeType.ALL)
	private List<Paiements> paiements;
		
	@OneToMany(cascade = CascadeType.ALL)
	private List<Fratrie> fratrie;
	
	
	

}
