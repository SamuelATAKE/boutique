/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.jdk.shtam.projetboutique.entities.Employe;

/**
 *
 * @author jdkshtam
 */
public class EmployeService {
    private static List<Employe> employes = new ArrayList<>();
    private static EmployeService INSTANCE;
     
     public EmployeService() {
     
     }

     public static synchronized EmployeService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new EmployeService();
         }
        return INSTANCE;
     }

     public EmployeService(List<Employe> employes){
        EmployeService.employes=employes;
     }

     public Employe ajouter(Employe employe) {
        this.getEmployes().add(employe);
        return employe;
     }

    public Employe modifier(Employe employe) {
      Employe fEmploye = this.trouver(employe.getId()); 
      fEmploye = employe;
      return fEmploye;
    }

     public void supprimer(Long id) {
      Employe fEmploye = this.trouver(id);
      employes.remove(fEmploye);
    }

    public Employe trouver(Long id) {
       Employe employe = null;
       for(Employe p: employes){
         if(Objects.equals(p.getId(), id)){
           employe = p;
           break;
         }
       }
       return employe;
    }

    public int compter() {
       return employes.size();
    }

    public List<Employe> getEmployes() {
        return employes;
    }
}
