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
import com.jdk.shtam.projetboutique.entities.Employe;
import com.jdk.shtam.projetboutique.service.EmployeService;

/**
 *
 * @author jdkshtam
 */
@Path("/employe")
public class EmployeResource {
    private EmployeService service;
   
    public EmployeResource() {
       this.service = EmployeService.getInstance();
    }

    @GET
    @Path("/list")
    public List<Employe> lister() {
      return this.service.getEmployes();
    }

    @GET
    @Path("/{id}")
    public Employe trouver(@PathParam("id") Long id) {
      return this.service.trouver(id);   
    }

    @GET
    @Path("/count")
    public int compter() {
      return this.service.compter();   
    }

    @POST
    public Employe ajouter(Employe employe) {
      return this.service.ajouter(employe);
    }

    @PUT
    public Employe modifier(Employe employe) {
       return this.service.modifier(employe);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
       this.service.supprimer(id);
    }
}
