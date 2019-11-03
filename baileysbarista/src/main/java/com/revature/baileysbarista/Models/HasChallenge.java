package com.revature.baileysbarista.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HasChallenge
 */
@Entity
@Table(name = "haschallenge")
public class HasChallenge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private Users userid;
    @Column
    private Challenges challengeid;

    public HasChallenge() {
    }

    public HasChallenge(int id, Users userid, Challenges challengeid) {
        this.id = id;
        this.userid = userid;
        this.challengeid = challengeid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

    public Challenges getChallengeid() {
        return challengeid;
    }

    public void setChallengeid(Challenges challengeid) {
        this.challengeid = challengeid;
    }
    
}