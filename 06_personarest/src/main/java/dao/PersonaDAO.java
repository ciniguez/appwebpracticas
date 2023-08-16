package dao;

import java.util.List;

import modelo.Persona;

public interface PersonaDAO {

	public Persona getById(int id);
	public List<Persona> getPersonas();
	public void addPersona(Persona p);
	public void actualizar(Persona p);
	public void eliminar (int id);
}
