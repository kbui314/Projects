package com.revature.baileysbarista.Services;

import com.revature.baileysbarista.Models.Challenges;
import com.revature.baileysbarista.Repositories.ChallengeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ChallengeService
 */
@Service
public class ChallengeService {
    @Autowired
    ChallengeRepository cr;

    public void createChallenges(Challenges challenge) {
        cr.save(challenge);
    }

	public void deleteChallenge(int id) {
        cr.deleteById(id);
    }   
}