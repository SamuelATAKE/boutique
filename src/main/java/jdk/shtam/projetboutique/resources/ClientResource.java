/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdk.shtam.projetboutique.resources;

import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import jdk.shtam.projetboutique.entities.Achat;
import jdk.shtam.projetboutique.entities.Client;

/**
 *
 * @author jdkshtam
 */
@Path("/client")
public class ClientResource {
    @GET
    @Path("/list")
    public List<Client> lister(){
      List<Client> clients = null;
      return clients;
    }

    @GET
    @Path("/find")
    public Client trouver(int id){
      Client client = null;
      return client;   
    }

    @POST
    @Path("/add")
    public Client ajouter(Client client){
      return client;
    }

    @PUT
    @Path("/update")
    public Client modifier(Client client){
       return client;
    }

    @DELETE
    @Path("/delete")
    public void delete(int id){

    }

    @DELETE
    @Path("/delete")
    public void delete(Client client){

    }
}
