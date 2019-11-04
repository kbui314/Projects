package com.revature.baileysbarista.Models;

import java.time.LocalDateTime;
import java.util.Arrays;
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
import javax.persistence.Transient;

/**
 * users
 */
@Entity
@Table(name = "users")
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
    private LocalDateTime dateenrolled;
    @Column
    private String usertype;
    @Transient
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "hasclass", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "classid"))
    Set<Classes> userClasses;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "haschallenge", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "challengeid"))
    Set<Challenges> userChallenges;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "hasskill", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "skillid"))
    Set<Skills> userSkills;

    public Users() {
    }

    public Users(int id, String username, String password, String usertype) {
        super();
        this.id = id;
        this.username = username;
        this.usertype = usertype;
        this.password = password;
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

    public LocalDateTime getDateenrolled() {
        return dateenrolled;
    }   

    public void setDateenrolled(LocalDateTime dateenrolled) {
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

    public Set<Classes> getUserClasses() {
        return userClasses;
    }

    public void setUserClasses(Set<Classes> userClasses) {
        this.userClasses = userClasses;
    }

    public Set<Challenges> getUserChallenges() {
        return userChallenges;
    }

    public void setUserChallenges(Set<Challenges> userChallenges) {
        this.userChallenges = userChallenges;
    }

    public Set<Skills> getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(Set<Skills> userSkills) {
        this.userSkills = userSkills;
    }

    @Override
    public String toString() {
        return "Users [dateenrolled=" + dateenrolled + ", hash=" + Arrays.toString(hash) + ", id=" + id + ", salt="
                + Arrays.toString(salt) + ", userChallenges=" + userChallenges + ", userClasses=" + userClasses
                + ", userSkills=" + userSkills + ", username=" + username + ", usertype=" + usertype + "]";
    }

    
}