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
    private int userid;
    @Column
    private int challengeid;

    public HasChallenge() {
    }

    public HasChallenge(int id, int userid, int challengeid) {
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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getChallengeid() {
        return challengeid;
    }

    public void setChallengeid(int challengeid) {
        this.challengeid = challengeid;
    }
    
}