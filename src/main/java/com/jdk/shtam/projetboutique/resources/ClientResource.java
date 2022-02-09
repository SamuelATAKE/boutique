/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdk.shtam.projetboutique.resources;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import com.jdk.shtam.projetboutique.entities.Client;
import com.jdk.shtam.projetboutique.service.ClientService;
import java.util.ArrayList;

/**
 *
 * @author jdkshtam
 */
@Path("/client")
public class ClientResource {
    private ClientService service;

   public ClientResource() {
    this.service = ClientService.getInstance();
   }

    @GET
    @Path("/list")
    public List<Client> lister() {
      return this.service.getClients();
    }

    @GET
    @Path("/{id}")
    public Client trouver(@PathParam("id") Long id) {
      return this.service.trouver(id);   
    }

    @GET
    @Path("/count")
    public int compter() {
      return this.service.compter();   
    }

    @POST
    public Client ajouter(Client client) {
      return this.service.ajouter(client);
    }

    @PUT
    public Client modifier(Client client) {
       return this.service.modifier(client);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
       this.service.supprimer(id);
    }
}
