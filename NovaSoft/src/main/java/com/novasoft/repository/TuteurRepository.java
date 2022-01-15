package com.novasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.novasoft.entity.Tuteur;

@Repository
public interface TuteurRepository extends JpaRepository<Tuteur, Long> {

}
