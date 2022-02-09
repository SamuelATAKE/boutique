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
import com.jdk.shtam.projetboutique.entities.Categorie;
import com.jdk.shtam.projetboutique.service.CategorieService;

/**
 *
 * @author jdkshtam
 */
@Path("/categorie")
public class CategorieResource {

    CategorieService service;

    public CategorieResource() {
      this.service = CategorieService.getInstance();
    }
    
    @GET
    public List<Categorie> lister(){
      return this.service.getCategories();
    }

    @GET
    @Path("/{id}")
    public Categorie trouver(@PathParam("id") int id){
      return this.service.trouver(id);   
    }

    @GET
    @Path("/count")
    public int compter() {
      return this.service.compter();   
    }

    @POST
    public Categorie ajouter(Categorie categorie){
      return this.service.ajouter(categorie);
    }

    @PUT
    public Categorie modifier(Categorie categorie){
       return this.service.modifier(categorie);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") int id){
       this.service.supprimer(id);
    }
}
