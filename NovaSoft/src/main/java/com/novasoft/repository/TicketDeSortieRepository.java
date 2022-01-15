package com.novasoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.novasoft.entity.Eleve;
import com.novasoft.entity.TicketDeSortie;

@Repository
public interface TicketDeSortieRepository extends JpaRepository<TicketDeSortie, Long>{
	
	

	@Query(value = "SELECT * FROM ticket_de_sortie t WHERE matricule_eleve LIKE %:matricule%", nativeQuery = true)
	public List<TicketDeSortie> getTicketByMatriculeEleve(String matricule);
	
	
}
