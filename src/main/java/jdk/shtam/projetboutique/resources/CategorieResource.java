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
import jdk.shtam.projetboutique.entities.Categorie;

/**
 *
 * @author jdkshtam
 */
@Path("/categorie")
public class CategorieResource {
    
    @GET
    @Path("/list")
    public List<Categorie> lister(){
      List<Categorie> categories = null;
      return categories;
    }

    @GET
    @Path("/find")
    public Categorie trouver(int id){
      Categorie categorie = null;
      return categorie;   
    }

    @POST
    @Path("/add")
    public Categorie ajouter(Categorie categorie){
      return categorie;
    }

    @PUT
    @Path("/update")
    public Categorie modifier(Categorie categorie){
       return categorie;
    }

    @DELETE
    @Path("/delete")
    public void delete(int id){

    }

    @DELETE
    @Path("/delete")
    public void delete(Categorie categorie){

    }
}
