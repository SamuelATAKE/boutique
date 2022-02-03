/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jdk.shtam.projetboutique.entities.Produit;

/**
 *
 * @author jdkshtam
 */
public class ProduitService {
     static List<Produit> produits = new ArrayList<>();
     
     public ProduitService() {
     
     }

     public ProduitService(List<Produit> produits) {
        this.produits=produits;
     }

     public Produit ajouter(Produit produit) {
        this.getProduits().add(produit);
        return produit;
     }

    public Produit modifier(Produit produit) {
      Produit fProduit = this.trouver(produit.getId()); 
      fProduit = produit;
      return fProduit;
    }

     public void supprimer(Long id) {
      Produit fProduit = this.trouver(id);
      produits.remove(fProduit);
    }

    public Produit trouver(Long id) {
       Produit produit = null;
       for(Produit p: produits){
         if(Objects.equals(p.getId(), id)) {
           produit = p;
           break;
         }
       }
       return produit;
    }

    public int compter() {
       return produits.size();
    }

    public List<Produit> getProduits() {
        return produits;
    }
}
