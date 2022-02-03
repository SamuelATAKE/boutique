/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jdkshtam
 */
public class Achat {
    private Long id;
    private LocalDateTime dateAchat;
    private Double remise;
    private Employe employe;
    private Client client;
    private List<ProduitAchete> produits = new ArrayList<>();

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Achat)) return false;
        Achat achat = (Achat) o;
        return getId().equals(achat.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Achat{" +
                "id=" + id +
                ", dateAchat=" + dateAchat +
                ", remise=" + remise +
                ", employe=" + employe +
                ", client=" + client +
                ", produits=" + produits +
                '}';
    }
}
