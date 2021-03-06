package com.novasoft.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ObjetSaisie implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long objetId;
	private String objetName;
	private Date dateDeSaisie;
	private String condistionDeSaisie;
	private String auteurSaisie;
	private String matriculeEleve;
	private Boolean isRestitue;
	
	
	public ObjetSaisie() {
		super();
	}
	
	
	

	public ObjetSaisie(String objetName, Date dateDeSaisie, String condistionDeSaisie, String auteurSaisie,
			String matriculeEleve, Boolean isRestitue) {
		super();
		this.objetName = objetName;
		this.dateDeSaisie = dateDeSaisie;
		this.condistionDeSaisie = condistionDeSaisie;
		this.auteurSaisie = auteurSaisie;
		this.matriculeEleve = matriculeEleve;
		this.isRestitue = isRestitue;
	}




	public Boolean getIsRestitue() {
		return isRestitue;
	}




	public void setIsRestitue(Boolean isRestitue) {
		this.isRestitue = isRestitue;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public Long getObjetId() {
		return objetId;
	}
	public void setObjetId(Long objetId) {
		this.objetId = objetId;
	}
	public String getObjetName() {
		return objetName;
	}
	public void setObjetName(String objetName) {
		this.objetName = objetName;
	}
	public Date getDateDeSaisie() {
		return dateDeSaisie;
	}
	public void setDateDeSaisie(Date dateDeSaisie) {
		this.dateDeSaisie = dateDeSaisie;
	}

	public String getCondistionDeSaisie() {
		return condistionDeSaisie;
	}
	public void setCondistionDeSaisie(String condistionDeSaisie) {
		this.condistionDeSaisie = condistionDeSaisie;
	}
	public String getAuteurSaisie() {
		return auteurSaisie;
	}
	public void setAuteurSaisie(String auteurSaisie) {
		this.auteurSaisie = auteurSaisie;
	}
	public String getMatriculeEleve() {
		return matriculeEleve;
	}
	public void setMatriculeEleve(String matriculeEleve) {
		this.matriculeEleve = matriculeEleve;
	}
	
	
	
	
	
	
	

}
