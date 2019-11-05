package com.revature.baileysbarista.Services;

import com.revature.baileysbarista.Models.HasSkill;
import com.revature.baileysbarista.Repositories.HasSkillRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * HasSkillService
 */
@Service
public class HasSkillService {
@Autowired
HasSkillRepository hsr;

    public void AddSkill(HasSkill hasSkill){
        hsr.save(hasSkill);
    }
    public void updateSkillEndorsement(String verified, int userid, int skillid){
        hsr.updateEndorsement(verified, userid, skillid);
    }
}