package com.novasoft.service;

import java.util.List;

import com.novasoft.entity.TicketDeSortie;

public interface TicketDeSortieServiceImpl {
	
	public void addTicket(TicketDeSortie ticket);
	public void deleteTicketById(Long ticketId);
	public List<TicketDeSortie> retrieveAllTIcket();
	
	public List<TicketDeSortie> getTicketByMatriculeEleve(String matricule);
	

}
