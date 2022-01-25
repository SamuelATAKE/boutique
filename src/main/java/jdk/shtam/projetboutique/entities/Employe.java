/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.entities;

import java.time.LocalDate;

/**
 *
 * @author jdkshtam
 */
public class Employe extends Personne {
    String cnss;

    public Employe() {
    }

    public Employe(String cnss, String nom, String prenoms, LocalDate dateNaissance) {
        super(nom, prenoms, dateNaissance);
        this.cnss = cnss;
    }

    public Employe(String cnss, Long id, String nom, String prenoms, LocalDate dateNaissance) {
        super(id, nom, prenoms, dateNaissance);
        this.cnss = cnss;
    }

    public String getCnss() {
        return cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }
    
    
}
