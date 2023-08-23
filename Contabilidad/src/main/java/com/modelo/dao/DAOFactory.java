package com.modelo.dao;


import com.modelo.jpa.JPADAOFactory;

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

	public abstract CuentaDAO getCuentaDAO();
	public abstract GastoDAO getGastoDAO();
	public abstract IngresoGastoDAO getIngresoGastoDAO();

	
	public abstract UsuarioDAO getUsuarioDAO();
	
	public abstract MovimientoDAO getMovimientoDAO();
	public abstract MovRecurrenteDAO getMovRecurrenteDAO();
	public abstract TransferenciaDAO getTransferenciaDAO();
	



}