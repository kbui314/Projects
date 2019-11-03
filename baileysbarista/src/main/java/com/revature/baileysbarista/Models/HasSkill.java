package com.revature.baileysbarista.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HasSkill
 */
@Entity
@Table(name = "hasskill")
public class HasSkill {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private int id;
@Column
private int userid;
@Column
private int skillid;
@Column
private String endorse;

    public HasSkill() {
    }

    public HasSkill(int id, int userid, int skillid, String endorse) {
        this.id = id;
        this.userid = userid;
        this.skillid = skillid;
        this.endorse = endorse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getSkillid() {
        return skillid;
    }

    public void setSkillid(int skillid) {
        this.skillid = skillid;
    }

    public String getEndorse() {
        return endorse;
    }

    public void setEndorse(String endorse) {
        this.endorse = endorse;
    }

}