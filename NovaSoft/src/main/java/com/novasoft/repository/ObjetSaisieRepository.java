package com.novasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novasoft.entity.ObjetSaisie;

@Repository
public interface ObjetSaisieRepository extends JpaRepository<ObjetSaisie, Long> {

}
