package com.revature.baileysbarista.Repositories;

import com.revature.baileysbarista.Models.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

}