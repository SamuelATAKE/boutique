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
import javax.ws.rs.PathParam;
import jdk.shtam.projetboutique.entities.Produit;

/**
 *
 * @author jdkshtam
 */
@Path("/produit")
public class ProduitResource {
    @GET
    @Path("/list")
    public List<Produit> lister() {
      List<Produit> produits = null;
      return produits;
    }

    @GET
    @Path("/{id}")
    public Produit trouver(@PathParam("id") int id) {
      Produit produit = null;
      return produit;   
    }

    @GET
    @Path("/count")
    public int compter() {
      return lister().size();   
    }

    @POST
    public Produit ajouter(Produit produit) {
      return produit;
    }

    @PUT
    public Produit modifier(Produit produit) {
       return produit;
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") int id) {

    }
}
