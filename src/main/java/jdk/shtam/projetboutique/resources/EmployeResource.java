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
import jdk.shtam.projetboutique.entities.Employe;

/**
 *
 * @author jdkshtam
 */
@Path("/employe")
public class EmployeResource {
    @GET
    @Path("/list")
    public List<Employe> lister(){
      List<Employe> employes = null;
      return employes;
    }

    @GET
    @Path("/find")
    public Employe trouver(int id){
      Employe employe = null;
      return employe;   
    }

    @POST
    @Path("/add")
    public Employe ajouter(Employe employe){
      return employe;
    }

    @PUT
    @Path("/update")
    public Employe modifier(Employe employe){
       return employe;
    }

    @DELETE
    @Path("/delete")
    public void delete(int id){

    }

    @DELETE
    @Path("/delete")
    public void delete(Employe employe){

    }
}
