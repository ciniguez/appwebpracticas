package modelo.jpa;

import java.util.*;

import javax.persistence.*;

import modelo.dao.BancoDAO;
import modelo.dao.CuentaDAO;
import modelo.dao.DAOFactory;
import modelo.dao.PersonaDAO;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
public class JPADAOFactory extends DAOFactory {

	public JPADAOFactory(){

	}

	public BancoDAO getBancoDAO(){
		return new JPABancoDAO();
	}

	public CuentaDAO getCuentaDAO(){
		return new JPACuentaDAO();
	}

	public PersonaDAO getPersonaDAO(){
		return new JPAPersonaDAO();
	}

}