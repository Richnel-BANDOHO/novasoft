package com.novasoft.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.novasoft.entity.Eleve;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long> {


	//@Query("SELECT u FROM User u WHERE u.role= :role")
	//List<User> retrieveUsersByRole(@Param("role") Role role)
//	
	
	@Query("SELECT e FROM Eleve e WHERE e.eleveTutorPhoneNum= :numTuteur ")
	public List<Eleve> findByTutorPhonenumber(@Param("numTuteur") String numTuteur);
	
//	@Query("update User u set u.role = :role where u.firstName = :fname")
//	int updateUserStatusByFirstName(@Param("role") Role role, @Param("fname") String 
//	fname)
//	
//	@Modifying
//	@Query("update Eleve e set e.paiements.montant = :montant WHERE e.eleveId =: eleveId")
//	public void addElevePaiementById( int montant, Long eleveId);
	
	@Query("SELECT e FROM Eleve e WHERE e.eleveClasse= :studentLevel")
	public List<Eleve> findAllEleveByStudentLevel(@Param("studentLevel") String studentLevel);
	
//	@Query("SELECT e FROM Eleve e WHERE e.eleveName =: eleveNom")
//	public List<Eleve> findAllEleveByName(@Param("eleveName") String eleveNom);
//	
	@Query("SELECT e FROM Eleve e WHERE e.eleveMatricule= :eleveMat")
	public Eleve findEleveByMatricule(@Param("eleveMat") String eleveMat);
	
	@Query(value = "SELECT MAX(eleve_id) FROM Eleve", nativeQuery = true)
	public int maxEleveId();
	
	@Query(value= "SELECT * FROM Eleve e WHERE eleve_name LIKE %:elveSearch% OR eleve_matricule LIKE %:elveSearch%", nativeQuery = true)
	public List<Eleve> searchEleve(@Param("elveSearch") String elveSearch);
	
	@Query("SELECT e FROM Eleve e")
	public Eleve getByPaiement();
//	@Modifying
//	@Query("UPDATE Eleve e "
//			+ "set e.paiements.montant =:mont"
//			+ "WHERE e.eleveId = :elvId  "
//			+ "AND e.paiements.mois= :elvMois")
//	public void updateElevePaiement(@Param("mont") int mont, @Param("elvId") Long elvId, @Param("elvMois") String elvMois);
//	
//	
	@Query(value = "SELECT * FROM Eleve e WHERE eleve_matricule LIKE %:matricule%", nativeQuery = true)
	public Eleve getEleveByMatricule(String matricule);
	
}
