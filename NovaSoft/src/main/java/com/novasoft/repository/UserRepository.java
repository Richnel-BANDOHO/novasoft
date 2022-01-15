package com.novasoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.novasoft.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
