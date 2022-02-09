/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.jdk.shtam.projetboutique.entities.Achat;

/**
 *
 * @author jdkshtam
 */
public class AchatService {
    private static List<Achat> achats = new ArrayList<>();
    private static AchatService INSTANCE;
     
     public AchatService() {
     
     }

     public static synchronized AchatService getInstance(){
       if(INSTANCE == null){
         INSTANCE = new AchatService();
       }

       return INSTANCE;
     }

     public AchatService(List<Achat> achats) {
        this.achats=achats;
     }

     public Achat ajouter(Achat achat) {
        this.getAchats().add(achat);
        return achat;
     }

    public Achat modifier(Achat achat) {
      Achat fAchat = this.trouver(achat.getId()); 
      if(fAchat.getId() != 0){
        achats.set(achats.indexOf(fAchat), achat);
        fAchat = achat;
      }
      
      return fAchat;
    }

     public void supprimer(Long id) {
      Achat fAchat = this.trouver(id);
      achats.remove(fAchat);
    }

    public Achat trouver(Long id) {
       Achat achat = null;
       for(Achat p: achats){
         if(Objects.equals(p.getId(), id)) {
           achat = p;
           break;
         }
       }
       return achat;
    }

    public int compter() {
       return achats.size();
    }

    public List<Achat> getAchats() {
        return achats;
    }
}
