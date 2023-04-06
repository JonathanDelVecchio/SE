/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sebe.model;

import jakarta.persistence.*;

@Entity
public class Extracurricular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private Boolean sportsParticipation;
    private String sportName;
    private Boolean fraternitySororityParticipation;
    private String fraternitySororityName;
    private Boolean internshipParticipation;
    private String companyName;
    private String internshipTitle;
    private Integer internshipYears;

    // Getters and setters for all properties

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Boolean getSportsParticipation() {
        return sportsParticipation;
    }

    public void setSportsParticipation(Boolean sportsParticipation) {
        this.sportsParticipation = sportsParticipation;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public Boolean getFraternitySororityParticipation() {
        return fraternitySororityParticipation;
    }

    public void setFraternitySororityParticipation(Boolean fraternitySororityParticipation) {
        this.fraternitySororityParticipation = fraternitySororityParticipation;
    }

    public String getFraternitySororityName() {
        return fraternitySororityName;
    }

    public void setFraternitySororityName(String fraternitySororityName) {
        this.fraternitySororityName = fraternitySororityName;
    }

    public Boolean getInternshipParticipation() {
        return internshipParticipation;
    }

    public void setInternshipParticipation(Boolean internshipParticipation) {
        this.internshipParticipation = internshipParticipation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInternshipTitle() {
        return internshipTitle;
    }

    public void setInternshipTitle(String internshipTitle) {
        this.internshipTitle = internshipTitle;
    }

    public Integer getInternshipYears() {
        return internshipYears;
    }

    public void setInternshipYears(Integer internshipYears) {
        this.internshipYears = internshipYears;
    }
    
}
