package com.novasoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.novasoft.entity.Paiements;

@Repository
public interface PaiementsRepository extends JpaRepository<Paiements, Long> {
	

	
	@Query("SELECT p FROM Paiements p WHERE p.paiementId= :paieId")
	public List<Paiements> addPaiement(@Param("paieId") Long paieId);
	
	@Modifying
	@Query("update Paiements p set p.montant = :montant where p.paiementId = :paiementId")
	public void updateMontantPaiement(@Param("montant") int montant, @Param("paiementId") Long paiementId);


}
