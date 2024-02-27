package dao;

import java.util.List;

import modelo.Persona;

public interface PersonaDAO {
	public List<Persona> getPersonas();
	
	public void addPersona(Persona p);
	
	public Persona getPersonaById(int id);
	
	public void actualizar(Persona p);
	
	public void eliminar(int id);
	
	
	
}
