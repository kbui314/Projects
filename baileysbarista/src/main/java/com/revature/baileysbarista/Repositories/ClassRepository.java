package com.revature.baileysbarista.Repositories;

import com.revature.baileysbarista.Models.Classes;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ClassRepository
 */
public interface ClassRepository extends JpaRepository<Classes,Integer> {
    
}