/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.service;

import com.jdk.shtam.projetboutique.entities.Categorie;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.jdk.shtam.projetboutique.entities.Produit;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jdkshtam
 */
public class ProduitService {
     private static List<Produit> produits = new ArrayList<>();
     private static ProduitService INSTANCE;
     
     public ProduitService() {
         Categorie c1 = new Categorie(1, "Chaussures", "Pour hommes");
         Categorie c2 = new Categorie(2, "Robe", "Pour femmes"); 
         produits.add(new Produit(1l, "NIKE", 20.0, LocalDate.of(2002, Month.MARCH, 4), c1));
         produits.add(new Produit(2l, "Fils", 50.0, LocalDate.of(2021, Month.APRIL, 4), c1));
         produits.add(new Produit(3l, "Salo", 35.0, LocalDate.of(2024, Month.FEBRUARY, 9), c2));
     } 

     public static synchronized ProduitService getInstance(){
       if(INSTANCE == null){
         INSTANCE = new ProduitService();
       }

       return INSTANCE;
     }

     public ProduitService(List<Produit> produits) {
        ProduitService.produits=produits;
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
