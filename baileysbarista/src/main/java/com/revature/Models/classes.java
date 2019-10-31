package com.revature.Models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

/**
 * classes
 */
@Entity
@Table(name = "classes")
public class classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private String classname;
    @Column
    private String classdec;
    @Column
    private int skillid;
    @Column
    private Date startdate;
    @Column
    private int enrolled;

    public classes(int id, String classname, String classdec, int skillid, Date startdate, int enrolled) {
        this.id = id;
        this.classname = classname;
        this.classdec = classdec;
        this.skillid = skillid;
        this.startdate = startdate;
        this.enrolled = enrolled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClassdec() {
        return classdec;
    }

    public void setClassdec(String classdec) {
        this.classdec = classdec;
    }

    public int getSkillid() {
        return skillid;
    }

    public void setSkillid(int skillid) {
        this.skillid = skillid;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void setEnrolled(int enrolled) {
        this.enrolled = enrolled;
    }

    
}