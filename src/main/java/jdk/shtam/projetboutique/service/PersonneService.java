/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jdk.shtam.projetboutique.entities.Personne;

/**
 *
 * @author jdkshtam
 */
public class PersonneService {
    static List<Personne> personnes = new ArrayList<Personne>();
     
     public PersonneService() {
     
     }

     public PersonneService(List<Personne> personnes){
        this.personnes=personnes;
     }

     public Personne ajouter(Personne personne) {
        this.getPersonnes().add(personne);
        return personne;
     }

    public Personne modifier(Personne personne){
      Personne fPersonne = this.trouver(personne.getId()); 
      fPersonne = personne;
      return fPersonne;
    }

     public void supprimer(Long id){
      Personne fPersonne = this.trouver(id);
      personnes.remove(fPersonne);
    }

    public Personne trouver(Long id){
       Personne personne = null;
       for(Personne p: personnes){
         if(Objects.equals(p.getId(), id)){
           personne = p;
           break;
         }
       }
       return personne;
    }

    public int compter() {
       return personnes.size();
    }

    public List<Personne> getPersonnes(){
        return personnes;
    }
}
