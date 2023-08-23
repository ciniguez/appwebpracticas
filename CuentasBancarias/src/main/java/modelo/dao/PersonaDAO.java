package modelo.dao;

import modelo.entities.Persona;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:21
 */
public interface PersonaDAO extends GenericDAO<Persona,Integer> {

	/**
	 * 
	 * @param username
	 * @param clave
	 */
	public Persona autorizar(String username, String clave);

}