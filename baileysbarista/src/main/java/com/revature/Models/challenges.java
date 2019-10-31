package com.revature.Models;

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
public class challenges {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private String challname;
    @Column
    private String challdesc;
    @Column
    private int classid;

    public challenges(int id, String challname, String challdesc, int classid) {
        this.id = id;
        this.challname = challname;
        this.challdesc = challdesc;
        this.classid = classid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChallname() {
        return challname;
    }

    public void setChallname(String challname) {
        this.challname = challname;
    }

    public String getChalldesc() {
        return challdesc;
    }

    public void setChalldesc(String challdesc) {
        this.challdesc = challdesc;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    
    
}