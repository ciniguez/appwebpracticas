package serviciosrest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import modelo.SimuladoImplementacionDAO.PersonaImplDAO;
import modelo.dao.PersonaDAO;
import modelo.entidad.Persona;

@Path("/formato")
public class FormatosRecurso {
	
	PersonaDAO personaDAO;
	public FormatosRecurso() {
		this.personaDAO = new PersonaImplDAO(); // Inyeccion de dependencias
	}

	@Path("/xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Persona getPersonaXML() {
		return this.personaDAO.getPersonaById(1);		
	}
	
	@Path("/json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getPersonaJSON() {
		return this.personaDAO.getPersonaById(1);	
	}
	
	@Path("/text")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response getPersonaTEXT() {
		
		return Response.ok( this.personaDAO.getPersonaById(1).toString()).build() ;	
	}
}
