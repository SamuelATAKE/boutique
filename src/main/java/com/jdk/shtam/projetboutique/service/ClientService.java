/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.jdk.shtam.projetboutique.entities.Client;

/**
 *
 * @author jdkshtam
 */
public class ClientService {
    private static List<Client> clients = new ArrayList<>();
    private static ClientService INSTANCE;
     
     public ClientService() {
     
     }

    public static synchronized ClientService getInstance() {
       if(null == INSTANCE) {
         INSTANCE = new ClientService();
       }
       return INSTANCE;
    }

     public ClientService(List<Client> clients) {
        this.clients=clients;
     }

     public Client ajouter(Client client) {
        this.getClients().add(client);
        return client;
     }

    public Client modifier(Client client) {
      Client fClient = this.trouver(client.getId()); 
      fClient = client;
      return fClient;
    }

     public void supprimer(Long id) {
      Client fClient = this.trouver(id);
      clients.remove(fClient);
    }

    public Client trouver(Long id) {
       Client client = null;
       for(Client p: clients){
         if(Objects.equals(p.getId(), id)){
           client = p;
           break;
         }
       }
       return client;
    }

    public int compter() {
       return clients.size();
    }

    public List<Client> getClients() {
        return clients;
    }
}
