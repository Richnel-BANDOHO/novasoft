package com.novasoft.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.novasoft.entity.TicketDeSortie;
import com.novasoft.repository.TicketDeSortieRepository;

@Service
public class TicketDeSortieService implements TicketDeSortieServiceImpl {

	
	@Autowired
	TicketDeSortieRepository ticketDeSortieRepository; 
	
	
	@Override
	public void addTicket(TicketDeSortie ticket) {
		ticket.setDateDuTicket(new Date());
		ticketDeSortieRepository.save(ticket);
	}

	@Override
	public void deleteTicketById(Long ticketId) {
		ticketDeSortieRepository.deleteById(ticketId);
		
	}

	@Override
	public List<TicketDeSortie> retrieveAllTIcket() {
		
		return ticketDeSortieRepository.findAll();
	}

	@Override
	public List<TicketDeSortie> getTicketByMatriculeEleve(String matricule) {
		
		return ticketDeSortieRepository.getTicketByMatriculeEleve(matricule);
		
	}

	
	

}
