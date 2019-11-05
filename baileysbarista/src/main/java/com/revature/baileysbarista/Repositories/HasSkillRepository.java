package com.revature.baileysbarista.Repositories;

import com.revature.baileysbarista.Models.HasSkill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * HasSkillRepository
 */
public interface HasSkillRepository extends JpaRepository<HasSkill,Integer> {
    @Modifying
    @Transactional
    @Query("update HasSkill set endorse = ?1 where userid = ?2 and skillid=?3")
    public void updateEndorsement(String endorse, int userid, int skillid);
}