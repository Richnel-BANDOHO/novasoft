package com.novasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.novasoft.entity.TicketDeSortie;
import com.novasoft.service.TicketDeSortieServiceImpl;

@RestController
@RequestMapping("/TicketDeSortie")
public class TicketDeSortieController {

	@Autowired
	TicketDeSortieServiceImpl ticketDeSortieServiceImpl; 
	
	
	@PostMapping("/add")
	public void addTicket(@RequestBody TicketDeSortie ticket) {
		ticketDeSortieServiceImpl.addTicket(ticket);
		
	}
	
	@GetMapping("/getTicket/{matricule}")
	public List<TicketDeSortie> getTicketByMatriculeEleve(@PathVariable String matricule){
		return ticketDeSortieServiceImpl.getTicketByMatriculeEleve(matricule);
	}
}
