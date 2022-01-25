/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author jdkshtam
 */
public class Personne {
    Long id;
    String nom;
    String prenoms;
    LocalDate dateNaissance;

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
       Date now;
       now = new Date();
       int age = (int) ChronoUnit.YEARS.between(getDateNaissance(), (Temporal) now);
       return age;
    } 

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne)) return false;
        Personne personne = (Personne) o;
        return id.equals(personne.id) && nom.equals(personne.nom) && prenoms.equals(personne.prenoms) && dateNaissance.equals(personne.dateNaissance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenoms, dateNaissance);
    }

    
}