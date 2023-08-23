package modelo.dao;

import java.util.*;
import modelo.entities.Cuenta;
import modelo.entities.Persona;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
public interface CuentaDAO extends GenericDAO<Cuenta,Integer> {

	/**
	 * 
	 * @param p
	 */
	public List<Cuenta> getAllByPersona(Persona p);

}