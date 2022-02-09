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
import com.jdk.shtam.projetboutique.entities.Achat;
import com.jdk.shtam.projetboutique.service.AchatService;

/**
 *
 * @author jdkshtam
 */
@Path("/achat")
public class AchatResource {
    AchatService service;

    public AchatResource() {
      this.service = AchatService.getInstance();
    }
    
    @GET
    public List<Achat> lister() {
      return this.service.getAchats();
    }

    @GET
    @Path("/{id}")
    public Achat trouver(@PathParam("id") Long id) {
      return this.service.trouver(id);   
    }

    @GET
    @Path("/count")
    public int compter() {
      return this.service.compter();   
    } 

    @POST
    public Achat ajouter(Achat achat) {
      return this.service.ajouter(achat);
    }

    @PUT
    public Achat modifier(Achat achat) {
       return this.service.modifier(achat);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
       this.service.supprimer(id);
    }
}
