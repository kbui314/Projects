package com.revature.baileysbarista.Services;

import com.revature.baileysbarista.Models.Skills;
import com.revature.baileysbarista.Repositories.SkillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SkillsService
 */
@Service
public class SkillsService {
    @Autowired
    SkillRepository sr;
	public void createSkill(Skills skill) {
        sr.save(skill);
	}
	public void deleteSkill(int id) {
        sr.deleteById(id);
	}

    
}