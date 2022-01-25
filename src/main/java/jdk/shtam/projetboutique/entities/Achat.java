/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.entities;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author jdkshtam
 */
public class Achat {
    Long id;
    LocalDateTime dateAchat;
    Double remise;
    Employe employe;
    Client client;
    List<ProduitAchete> produits;

    public Achat() {
    }

    public Achat(LocalDateTime dateAchat, Double remise, Employe employe, Client client, List<ProduitAchete> produits) {
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.employe = employe;
        this.client = client;
        this.produits = produits;
    }

    public Achat(Long id, LocalDateTime dateAchat, Double remise, Employe employe, Client client, List<ProduitAchete> produits) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.employe = employe;
        this.client = client;
        this.produits = produits;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDateTime dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Double getRemise() {
        return remise;
    }

    public void setRemise(Double remise) {
        this.remise = remise;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double getRemiseTotal(){
       Double remiseTotal = null;
       for(ProduitAchete produitAchete : this.produits){
          remiseTotal += produitAchete.getRemise();
       }
       return remiseTotal;
    }

    public Double getPrixTotal(){
       Double prixTotal = null;
       for(ProduitAchete produitAchete : this.produits){
          prixTotal += produitAchete.getPrixTotal();
       }
       return prixTotal;
    }
}
