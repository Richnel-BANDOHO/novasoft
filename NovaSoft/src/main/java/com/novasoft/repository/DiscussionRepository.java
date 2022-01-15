package com.novasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.novasoft.entity.Discussion;

@Repository
public interface DiscussionRepository extends JpaRepository<Discussion, Long>{

}
