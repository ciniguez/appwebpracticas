package modelo.jpa;

import java.util.*;

import javax.persistence.*;
import modelo.entities.Persona;
import modelo.dao.PersonaDAO;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:21
 */
public class JPAPersonaDAO extends JPAGenericDAO<Persona,Integer> implements PersonaDAO {

	public JPAPersonaDAO(){
		super(Persona.class);
	}

	/**
	 * 
	 * @param username
	 * @param clave
	 */
	public Persona autorizar(String username, String clave){
		String JPQL = "SELECT p FROM Persona p WHERE p.username= :username AND p.clave= :clave";
		Query query =  em.createQuery(JPQL);
		query.setParameter("username", username);
		query.setParameter("clave", clave);
		
		return (Persona)query.getSingleResult();
	}

}