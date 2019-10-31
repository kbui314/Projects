package com.revature.Models;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.springframework.data.annotation.Transient;

/**
 * users
 */
@Entity
@Table(name="users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column
    private String username;
    @Column
    private byte[] hash;
    @Column
    private byte[] salt; 
    @Column
    private Date dateenrolled;
    @Column
    private String usertype;
    @Transient
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "hasclasses", 
        joinColumns = @JoinColumn(name = "userid"), 
        inverseJoinColumns = @JoinColumn(name = "classid"))
    Set<classes> userClasses;
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "haschallenge", 
        joinColumns = @JoinColumn(name = "userid"), 
        inverseJoinColumns = @JoinColumn(name = "challid"))
    Set<challenges> userChallenges;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "hasskil", 
        joinColumns = @JoinColumn(name = "userid"), 
        inverseJoinColumns = @JoinColumn(name = "skillid"))
    Set<skills> userSkills;
    

    public Users(int id, String username, String usertype, Date dateenrolled) {
        this.id = id;
        this.username = username;
        this.usertype = usertype;
        this.dateenrolled = dateenrolled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateenrolled() {
        return dateenrolled;
    }

    public void setDateenrolled(Date dateenrolled) {
        this.dateenrolled = dateenrolled;
    }

    public byte[] getSalt() {
        return salt;
    }

    public void setSalt(byte[] salt) {
        this.salt = salt;
    }

    public byte[] getHash() {
        return hash;
    }

    public void setHash(byte[] hash) {
        this.hash = hash;
    }

    public Set<classes> getUserClasses() {
        return userClasses;
    }

    public void setUserClasses(Set<classes> userClasses) {
        this.userClasses = userClasses;
    }

    public Set<challenges> getUserChallenges() {
        return userChallenges;
    }

    public void setUserChallenges(Set<challenges> userChallenges) {
        this.userChallenges = userChallenges;
    }

    public Set<skills> getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(Set<skills> userSkills) {
        this.userSkills = userSkills;
    }
}