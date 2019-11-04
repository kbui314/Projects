package com.revature.baileysbarista.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HasClass
 */
@Entity
@Table(name="hasclass")
public class HasClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private int userid;
    @Column
    private int classid;
    @Column
    private String class_status;

    public HasClass() {
    }

    public HasClass(int id, int userid, int classid, String status) {
        this.id = id;
        this.userid = userid;
        this.classid = classid;
        this.class_status = status;
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

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getStatus() {
        return class_status;
    }

    public void setStatus(String status) {
        this.class_status = status;
    }

}