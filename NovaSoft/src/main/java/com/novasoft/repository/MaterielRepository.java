package com.novasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.novasoft.entity.Materiel;


@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Long> {

}
