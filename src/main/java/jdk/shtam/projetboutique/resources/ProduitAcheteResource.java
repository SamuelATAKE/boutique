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
import jdk.shtam.projetboutique.entities.ProduitAchete;

/**
 *
 * @author jdkshtam
 */
@Path("/produitachete")
public class ProduitAcheteResource {
    @GET
    @Path("/list")
    public List<ProduitAchete> lister() {
      List<ProduitAchete> produits = null;
      return produits;
    }

    @GET
    @Path("/{id}")
    public ProduitAchete trouver(@PathParam("id") int id) {
      ProduitAchete produit = null;
      return produit;   
    }

    @GET
    @Path("/count")
    public int compter() {
      return lister().size();   
    }

    @POST
    public ProduitAchete ajouter(ProduitAchete produit) {
      return produit;
    }

    @PUT
    public ProduitAchete modifier(ProduitAchete produitAchete) {
       return produitAchete;
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") int id) { 

    }
}
