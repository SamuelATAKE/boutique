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
public class Client extends Personne{
    String cin;
    String carteVisa;

    public Client() {
    }

    public Client(String cin, String carteVisa, String nom, String prenoms, LocalDate dateNaissance) {
        super(nom, prenoms, dateNaissance);
        this.cin = cin;
        this.carteVisa = carteVisa;
    }

    public Client(String cin, String carteVisa, Long id, String nom, String prenoms, LocalDate dateNaissance) {
        super(id, nom, prenoms, dateNaissance);
        this.cin = cin;
        this.carteVisa = carteVisa;
    }

    
}
