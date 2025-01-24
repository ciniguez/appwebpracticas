package modelo.dao;

import java.util.List;

import modelo.entidad.Persona;

public interface PersonaDAO {
	
	public List<Persona> getPersonas();
	
	public void addPersona( Persona p);
	
	public void actualizarPersona( Persona p);
	
	public void eliminarPersona( int id);
	
	public Persona getPersonaById( int id);
	

}
