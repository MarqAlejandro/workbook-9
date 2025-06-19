package com.plurasight.demo;


import jakarta.persistence.*;
@Entity
@Table(name = "Citizens", schema = "GTA")
public class Citizen {
    @Id
    @Column(name = "CitizenID")
    private Long citizenId;
    @Column(name = "Name")
    private String name;
    @Column(name = "Alias")
    private String alias;
    @Column(name = "Age")
    private Long age;
    @Column(name = "Profession")
    private String profession;
    @Column(name = "WantedLevel")
    private Long wantedLevel;
// Getters and setters must be defined here...


    public Long getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(Long citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Long getWantedLevel() {
        return wantedLevel;
    }

    public void setWantedLevel(Long wantedLevel) {
        this.wantedLevel = wantedLevel;
    }
}