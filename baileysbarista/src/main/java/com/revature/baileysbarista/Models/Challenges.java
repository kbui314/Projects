package com.revature.baileysbarista.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * challenges
 */
@Entity
@Table(name = "challenge")
public class Challenges {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private String challengename;
    @Column
    private String challengedesc;
    @Column
    private int classid;

    public Challenges(int id, String challengename, String challengedesc, int classid) {
        this.id = id;
        this.challengename = challengename;
        this.challengedesc = challengedesc;
        this.classid = classid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChallengename() {
        return challengename;
    }

    public void setChallengename(String challengename) {
        this.challengename = challengename;
    }

    public String getChallengedesc() {
        return challengedesc;
    }

    public void setChallengedesc(String challengedesc) {
        this.challengedesc = challengedesc;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    
    
}