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
import jdk.shtam.projetboutique.entities.Achat;

/**
 *
 * @author jdkshtam
 */
@Path("/achat")
public class AchatResource {
    
    @GET
    @Path("/list")
    public List<Achat> lister() {
      List<Achat> achats = null;
      return achats;
    }

    @GET
    @Path("/{id}")
    public Achat trouver(@PathParam("id") Long id) {
      Achat achat = null;
      return achat;   
    }

    @GET
    @Path("/count")
    public int compter() {
      return lister().size();   
    } 

    @POST
    public Achat ajouter(Achat achat) {
      return achat;
    }

    @PUT
    public Achat modifier(Achat achat) {
       return achat;
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {

    }
}
