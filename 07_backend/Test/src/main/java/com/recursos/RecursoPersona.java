package com.recursos;

import java.util.List;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Usuario;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/personas")
public class RecursoPersona {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> getPersonas() {
		
		return DAOFactory.getFactory().getPersonaDAO().get();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario getPersonaPorId(@PathParam("id") int id) {
		return DAOFactory.getFactory().getPersonaDAO().getById(id);
	}
	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void guardarPersona(Usuario p) {
		DAOFactory.getFactory().getPersonaDAO().create(p);
	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizarPersona(Usuario p) {
		DAOFactory.getFactory().getPersonaDAO().update(p);
	}
	
	@DELETE
	@Path("/delete/{id}")
	public void eliminarPersona(@PathParam("id") int id) {
		DAOFactory.getFactory().getPersonaDAO().deleteByID(id);
	}
	

}
