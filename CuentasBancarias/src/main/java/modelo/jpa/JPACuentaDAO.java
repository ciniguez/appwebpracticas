package modelo.jpa;

import java.util.*;

import javax.persistence.*;
import modelo.entities.Cuenta;
import modelo.entities.Persona;
import modelo.dao.CuentaDAO;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
public class JPACuentaDAO extends JPAGenericDAO<Cuenta, Integer> implements CuentaDAO {

	public JPACuentaDAO(){
		super(Cuenta.class);
	}

	/**
	 * 
	 * @param p
	 */
	public List<Cuenta> getAllByPersona(Persona p){
		return null;
	}


}