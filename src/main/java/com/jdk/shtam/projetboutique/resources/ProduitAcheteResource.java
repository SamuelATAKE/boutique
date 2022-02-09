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
import com.jdk.shtam.projetboutique.entities.ProduitAchete;
import com.jdk.shtam.projetboutique.service.ProduitAcheteService;

/**
 *
 * @author jdkshtam
 */
@Path("/produitachete")
public class ProduitAcheteResource {
   private ProduitAcheteService service;
 
   public ProduitAcheteResource() {
       this.service = ProduitAcheteService.getInstance();
    }

    @GET
    @Path("/list")
    public List<ProduitAchete> lister() {
      return this.service.getProduitAchetes();
    }

    @GET
    @Path("/{id}")
    public ProduitAchete trouver(@PathParam("idProduit") Long idProduit, @PathParam("idAchat") Long idAchat) {
      return this.service.trouver(idProduit, idAchat);   
    }

    @GET
    @Path("/count")
    public int compter() {
      return this.service.compter();   
    }

    @POST
    public ProduitAchete ajouter(ProduitAchete produit) {
      return this.service.ajouter(produit);
    }

    @PUT
    public ProduitAchete modifier(ProduitAchete produitAchete) {
       return this.modifier(produitAchete);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") ProduitAchete produitAchete) { 
       this.service.supprimer(produitAchete);
    }
}
