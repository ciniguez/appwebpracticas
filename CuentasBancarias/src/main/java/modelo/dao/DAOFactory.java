package modelo.dao;


import modelo.jpa.JPADAOFactory;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
public abstract class DAOFactory {

	private static DAOFactory factory = new JPADAOFactory();

	public DAOFactory(){

	}

	public static DAOFactory getFactory(){
		return factory;
	}

	public abstract BancoDAO getBancoDAO();

	public abstract PersonaDAO getPersonaDAO();

	public abstract CuentaDAO getCuentaDAO();

}