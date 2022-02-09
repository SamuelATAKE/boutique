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
import com.jdk.shtam.projetboutique.entities.Produit;
import com.jdk.shtam.projetboutique.service.ProduitService;

/**
 *
 * @author jdkshtam
 */
@Path("/produit")
public class ProduitResource {
    private ProduitService service;

    public ProduitResource() {
       this.service = ProduitService.getInstance();
    }    

    @GET
    public List<Produit> lister() {
      return this.service.getProduits();
    }

    @GET
    @Path("/{id}")
    public Produit trouver(@PathParam("id") Long id) {
      return this.service.trouver(id);   
    }

    @GET
    @Path("/count")
    public int compter() {
      return this.service.compter();   
    }

    @POST
    public Produit ajouter(Produit produit) {
      return this.service.ajouter(produit);
    }

    @PUT
    public Produit modifier(Produit produit) {
       return this.service.modifier(produit);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
      this.service.supprimer(id);
    }
}
