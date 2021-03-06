/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.jdk.shtam.projetboutique.entities.Categorie;

/**
 *
 * @author jdkshtam
 */
public class CategorieService {
    private static List<Categorie> categories = new ArrayList<>();
    private static CategorieService INSTANCE;
     
     public CategorieService() {
     
     }

     public static synchronized  CategorieService getInstance(){
       if(INSTANCE == null){
         INSTANCE = new CategorieService();
       }

       return INSTANCE;
     }

     public CategorieService(List<Categorie> categories) {
        this.categories=categories;
     }

     public Categorie ajouter(Categorie categorie) {
        this.getCategories().add(categorie);
        return categorie;
     }

    public Categorie modifier(Categorie categorie) {
      Categorie fCategorie = this.trouver(categorie.getId()); 
      fCategorie = categorie;
      return fCategorie;
    }

     public void supprimer(Integer id) {
      Categorie fCategorie = this.trouver(id);
      categories.remove(fCategorie);
    }

    public Categorie trouver(Integer id) {
       Categorie categorie = null;
       for(Categorie p: categories){
         if(Objects.equals(p.getId(), id)){
           categorie = p;
           break;
         }
       }
       return categorie;
    }

    public int compter() {
       return categories.size();
    }

    public List<Categorie> getCategories() {
        return categories;
    }
}
