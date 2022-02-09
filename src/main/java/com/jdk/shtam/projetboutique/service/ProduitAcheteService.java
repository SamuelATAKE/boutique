/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.jdk.shtam.projetboutique.entities.ProduitAchete;

/**
 *
 * @author jdkshtam
 */
public class ProduitAcheteService {
    private static List<ProduitAchete> produitAchetes = new ArrayList<>();
    private static ProduitAcheteService INSTANCE;
     
     public ProduitAcheteService() {
     
     }
     
     public static synchronized ProduitAcheteService getInstance(){
       if(INSTANCE == null) {
         INSTANCE = new ProduitAcheteService();
       }
       return INSTANCE;
     }

     public ProduitAcheteService(List<ProduitAchete> produitAchetes) {
        this.produitAchetes=produitAchetes;
     }

     public ProduitAchete ajouter(ProduitAchete produitAchete) {
        this.getProduitAchetes().add(produitAchete);
        return produitAchete;
     }

    public ProduitAchete modifier(ProduitAchete produitAchete) {
      ProduitAchete fProduitAchete = this.trouver(produitAchete.getProduit().getId(), produitAchete.getAchat().getId()); 
      fProduitAchete = produitAchete;
      return fProduitAchete;
    }

     public void supprimer(ProduitAchete produitAchete) {
      ProduitAchete fProduitAchete = this.trouver(produitAchete.getProduit().getId(), produitAchete.getAchat().getId());
      produitAchetes.remove(fProduitAchete);
    }

    public ProduitAchete trouver(Long idProduit, Long idAchat) {
       ProduitAchete produitAchete = null;
       for(ProduitAchete p: produitAchetes){
         if(Objects.equals(p.getProduit().getId(), idProduit) && Objects.equals(p.getAchat().getId(), idAchat)){
           produitAchete = p;
           break;
         }
       }
       return produitAchete;
    }

    public int compter() {
       return produitAchetes.size();
    }

    public List<ProduitAchete> getProduitAchetes() {
        return produitAchetes;
    }
}
