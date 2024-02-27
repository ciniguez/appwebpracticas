package serviciosrest.persona;

import java.util.List;


import dao.PersonaDAO;
import implementacionDAO.ImplPersonaDAO;
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
import modelo.Persona;

@Path("personas")
public class PeresonaRecurso {
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> getPersonas() {
		// 1.- obtener parametros
		// 2.- Llamar al modelo
		PersonaDAO modelo = new ImplPersonaDAO();
		List<Persona> respuesta = modelo.getPersonas();
		// 3.- Devolver datos
		return respuesta;

	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getPersonaByPathParam(@PathParam("id")  int id) {
		PersonaDAO modelo = new ImplPersonaDAO();
		Persona respuesta =modelo.getPersonaById(id);
		return respuesta;
	}

	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public Persona getPaersonaByQueryParam(@QueryParam("id") int id) {
		PersonaDAO modelo = new ImplPersonaDAO();
		Persona respuesta =modelo.getPersonaById(id);
		return respuesta;
	}

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	public void guardarPersona(Persona p) {
		PersonaDAO modelo = new ImplPersonaDAO();
		modelo.addPersona(p);

	}
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizarPersona(Persona p) {
		PersonaDAO modelo = new ImplPersonaDAO();
		modelo.actualizar(p);

	}

	@DELETE
	@Path("/delete/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void eliminarPersona(@PathParam ("id") int id) {
		PersonaDAO modelo = new ImplPersonaDAO();
		modelo.eliminar(id);
	}
}
