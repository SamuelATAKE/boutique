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
import jdk.shtam.projetboutique.entities.ProduitAchete;

/**
 *
 * @author jdkshtam
 */
@Path("/produitachete")
public class ProduitAcheteResource {
    @GET
    @Path("/list")
    public List<ProduitAchete> lister(){
      List<ProduitAchete> produits = null;
      return produits;
    }

    @GET
    @Path("/find")
    public ProduitAchete trouver(int id){
      ProduitAchete produit = null;
      return produit;   
    }

    @POST
    @Path("/add")
    public ProduitAchete ajouter(ProduitAchete produit){
      return produit;
    }

    @PUT
    @Path("/update")
    public ProduitAchete modifier(ProduitAchete produitAchete){
       return produitAchete;
    }

    @DELETE
    @Path("/delete")
    public void delete(int id){

    }

    @DELETE
    @Path("/delete")
    public void delete(ProduitAchete produitAchete){

    }
}
