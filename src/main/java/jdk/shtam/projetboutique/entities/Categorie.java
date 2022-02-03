 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.entities;

 import java.util.Objects;

 /**
 *
 * @author jdkshtam
 */
public class Categorie {
    private Integer id;
    private String libelle;
    private String description;

    public Categorie() {
    }

    public Categorie(String libelle, String description) {
        this.libelle = libelle;
        this.description = description;
    }

    public Categorie(Integer id, String libelle, String description) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Categorie)) return false;
         Categorie categorie = (Categorie) o;
         return getId().equals(categorie.getId());
     }

     @Override
     public int hashCode() {
         return Objects.hash(getId());
     }

     @Override
     public String toString() {
         return "Categorie{" +
                 "id=" + id +
                 ", libelle='" + libelle + '\'' +
                 ", description='" + description + '\'' +
                 '}';
     }
 }
