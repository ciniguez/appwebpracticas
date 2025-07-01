package modelo.dao;

import java.util.List;

import modelo.entities.Persona;

public interface PersonaDAO {

	public Persona autorizar(String nombre, String clave);
	public List<Persona> getPersonas();
	public Persona getPersonaById(int id);
	public void create( Persona p);
	public void update(Persona p);
	public void delete(int id);
}