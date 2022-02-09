/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.entities;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author jdkshtam
 */
public class Client extends Personne {
    private String cin;
    private String carteVisa;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return cin.equals(client.cin) && carteVisa.equals(client.carteVisa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cin, carteVisa);
    }

    @Override
    public String toString() {
        return "Client{" +
                "cin='" + cin + '\'' +
                ", carteVisa='" + carteVisa + '\'' +
                '}';
    }
}
