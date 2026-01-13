 package com.modelo.jpa;

import com.modelo.dao.DAOFactory;
import com.modelo.dao.CuentaBancariaDAO;
import com.modelo.dao.UsuarioDAO;
import com.modelo.dao.BancoDAO;


public class JPADAOFactory extends DAOFactory {

	@Override
	public UsuarioDAO getPersonaDAO() {
	
		return new JPAUsuarioDAO();
	}

	

	@Override
	public BancoDAO getBancoDAO() {
		return new JPABancoDAO();
	}



	@Override
	public CuentaBancariaDAO getCuentaBancariaDAO() {
		return new JPACuentaBancariaDAO();
	}



}
