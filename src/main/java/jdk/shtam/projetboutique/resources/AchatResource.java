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

/**
 *
 * @author jdkshtam
 */
@Path("/achat")
public class AchatResource {
    
    @GET
    @Path("/list")
    public List<Achat> lister(){
      List<Achat> achats = null;
      return achats;
    }

    @GET
    @Path("/find")
    public Achat trouver(int id){
      Achat achat = null;
      return achat;   
    }

    @POST
    @Path("/add")
    public Achat ajouter(Achat achat){
      return achat;
    }

    @PUT
    @Path("/update")
    public Achat modifier(Achat achat){
       return achat;
    }

    @DELETE
    @Path("/delete")
    public void delete(int id){

    }

    @DELETE
    @Path("/delete")
    public void delete(Achat achat){

    }
}
