package serviciosrest;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import modelo.JPAImpl.JPAPersonaDAO;
import modelo.dao.PersonaDAO;
import modelo.entities.Persona;

@Path("/personas")
public class PersonaRecurso {
	private PersonaDAO dao;
	
	public PersonaRecurso() {
		dao = new JPAPersonaDAO();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> getPersonas(){
		return dao.getPersonas();
		
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getPersonaByPathParam(@PathParam("id") int id) {
		return dao.getPersonaById(id);
	}
	
	@Path("/query")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getPersonaByQueryParam(@QueryParam("id") int id) {
		return dao.getPersonaById(id);
	}
	
	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean guardarPersona(Persona p) {
		try {			
			dao.create(p);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	@Path("/update")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean actualizarPersona(Persona p) {
		try {			
			dao.update(p);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	@Path("/delete/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean eliminarUsuario(@PathParam("id") int id) {
		try {			
			dao.delete(id);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
