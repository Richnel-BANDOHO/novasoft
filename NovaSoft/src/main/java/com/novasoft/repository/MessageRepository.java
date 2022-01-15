package com.novasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.novasoft.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
