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
import jakarta.ws.rs.core.MediaType;
import modelo.SimuladoImplementacionDAO.PersonaImplDAO;
import modelo.dao.PersonaDAO;
import modelo.entidad.Persona;

@Path("/persona")
public class CrudPersona {

	private PersonaDAO personaDAO;
	public CrudPersona() {
		this.personaDAO = new PersonaImplDAO();
		
	}
	
	@Path("/listar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> getPersonas(){
		return personaDAO.getPersonas();
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getPersonaById(@PathParam("id") int id) {
		return this.personaDAO.getPersonaById(id);
	}
	
	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void crear(Persona p) {
		this.personaDAO.addPersona(p);
	}
	
	@Path("/update")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(Persona p) {
		this.personaDAO.actualizarPersona(p);
		
	}
	@Path("/delete/{id}")
	@DELETE
	public void eliminar(@PathParam("id") int id) {
		
	}
	 
}
