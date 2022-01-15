package com.novasoft.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class TicketDeSortie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ticketDeSortirId;
	private String eleveName;
	private String eleveFirstName;
	private Date dateDuTicket;
	private String classeEleve;
	private String matriculeEleve;
	
	@Lob
	private String motifDuTicket;
	

	public TicketDeSortie() {
		super();
	}
	public TicketDeSortie(String eleveName, String eleveFirstName, Date dateDuTicket, String classeEleve,
			String matriculeEleve, String motifDuTicket) {
		super();
		this.eleveName = eleveName;
		this.eleveFirstName = eleveFirstName;
		this.dateDuTicket = dateDuTicket;
		this.classeEleve = classeEleve;
		this.matriculeEleve = matriculeEleve;
		this.motifDuTicket = motifDuTicket;
	}
	public String getClasseEleve() {
		return classeEleve;
	}
	public void setClasseEleve(String classeEleve) {
		this.classeEleve = classeEleve;
	}
	public String getMatriculeEleve() {
		return matriculeEleve;
	}
	public void setMatriculeEleve(String matriculeEleve) {
		this.matriculeEleve = matriculeEleve;
	}
	
	
	public Long getTicketDeSortirId(){
		return ticketDeSortirId;
	}
	public void setTicketDeSortirId(Long ticketDeSortirId) {
		this.ticketDeSortirId = ticketDeSortirId;
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
	public Date getDateDuTicket() {
		return dateDuTicket;
	}
	public void setDateDuTicket(Date dateDuTicket) {
		this.dateDuTicket = dateDuTicket;
	}
	public String getMotifDuTicket() {
		return motifDuTicket;
	}
	public void setMotifDuTicket(String motifDuTicket) {
		this.motifDuTicket = motifDuTicket;
	}
	
	
	
	

}
