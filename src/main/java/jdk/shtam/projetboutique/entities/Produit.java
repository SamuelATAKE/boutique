/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

/**
 *
 * @author jdkshtam
 */
public class Produit {
    private Long id;
    private String libelle;
    private Double prixUnitaire;
    private LocalDate datePeremption;
    private Categorie categorie;

    public Produit() {
    }

    public Produit(String libelle, Double prixUnitaire, LocalDate datePeremption, Categorie categorie) {
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremption = datePeremption;
        this.categorie = categorie;
    }

    public Produit(Long id, String libelle, Double prixUnitaire, LocalDate datePeremption, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremption = datePeremption;
        this.categorie = categorie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public LocalDate getDatePeremption() {
        return datePeremption;
    }

    public void setDatePeremption(LocalDate datePeremption) {
        this.datePeremption = datePeremption;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public boolean estPerime(){
       Date now;
       now = new Date();
       int age = (int) ChronoUnit.YEARS.between(getDatePeremption(), (Temporal) now);

       if(age >= 0){
          return true;
       }else{
          return false;
       }
    }

     
}
