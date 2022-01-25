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
     Integer quantite;
     Double remise;
     Produit produit;

    public ProduitAchete() {
    }

    public ProduitAchete(Integer quantite, Double remise, Produit produit) {
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

    
}
