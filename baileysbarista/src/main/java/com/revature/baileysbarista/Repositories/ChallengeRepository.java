package com.revature.baileysbarista.Repositories;

import com.revature.baileysbarista.Models.Challenges;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ChallengeRepository
 */
public interface ChallengeRepository extends JpaRepository<Challenges,Integer> {

}