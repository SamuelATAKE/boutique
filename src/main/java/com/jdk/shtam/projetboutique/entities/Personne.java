/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jdkshtam
 */
public class Personne {
    private Long id;
    private String nom;
    private String prenoms;
    private LocalDate dateNaissance;

    public Personne() {
    }

    public Personne(String nom, String prenoms, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.dateNaissance = dateNaissance;
    }

    public Personne(Long id, String nom, String prenoms, LocalDate dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenoms = prenoms;
        this.dateNaissance = dateNaissance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getAge(){
       LocalDate now;
       now = LocalDate.now();
       int age = (int) ChronoUnit.YEARS.between(getDateNaissance(), now);
       return age;
    } 
    
}
