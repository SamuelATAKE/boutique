/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.entities;

/**
 *
 * @author jdkshtam
 */
public class ProduitAchete {
     private Integer quantite;
     private Double remise;
     private Produit produit;
     private Achat achat;

    public ProduitAchete() {
    }

    public ProduitAchete(Integer quantite, Double remise, Produit produit, Achat achat) {
        this.quantite = quantite;
        this.remise = remise;
        this.produit = produit;
    }

    public Double getPrixTotal(){
        return produit.getPrixUnitaire()*quantite*(1-remise);
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Double getRemise() {
        return remise;
    }

    public void setRemise(Double remise) {
        this.remise = remise;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }

     

    
}
