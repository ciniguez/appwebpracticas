package com.modelo.jpa;

import java.util.*;

import javax.persistence.*;

import com.modelo.dao.CuentaDAO;
import com.modelo.dao.DAOFactory;
import com.modelo.dao.GastoDAO;
import com.modelo.dao.IngresoGastoDAO;
import com.modelo.dao.MovRecurrenteDAO;
import com.modelo.dao.MovimientoDAO;
import com.modelo.dao.TransferenciaDAO;
import com.modelo.dao.UsuarioDAO;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
public class JPADAOFactory extends DAOFactory {

	@Override
	public CuentaDAO getCuentaDAO() {
		return new JPACuentaDAO();
	}

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new JPAUsuarioDAO();
	}

	@Override
	public MovimientoDAO getMovimientoDAO() {
		return new JPAMovimientoDAO();
	}

	@Override
	public MovRecurrenteDAO getMovRecurrenteDAO() {
		return new JPAMovRecurrenteDAO();
	}

	@Override
	public TransferenciaDAO getTransferenciaDAO() {
		return new JPATransferenciaDAO();
	}

	@Override
	public GastoDAO getGastoDAO() {
		return new JPAGastoDAO();
	}

	@Override
	public IngresoGastoDAO getIngresoGastoDAO() {
		return new JPAIngresoGastoDAO();
	}






}