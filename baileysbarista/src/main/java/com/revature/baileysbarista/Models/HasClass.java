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
    private Users userid;
    @Column
    private Classes classid;
    @Column
    private String status;

    public HasClass() {
    }

    public HasClass(int id, Users userid, Classes classid, String status) {
        this.id = id;
        this.userid = userid;
        this.classid = classid;
        this.status = status;
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

    public Classes getClassid() {
        return classid;
    }

    public void setClassid(Classes classid) {
        this.classid = classid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}