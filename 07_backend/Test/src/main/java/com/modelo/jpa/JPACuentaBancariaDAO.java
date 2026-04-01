package com.modelo.jpa;

import java.util.List;

import jakarta.persistence.Query;

import com.modelo.dao.CuentaBancariaDAO;
import com.modelo.entidades.CuentaBancaria;


public class JPACuentaBancariaDAO extends JPAGenericDAO<CuentaBancaria, Integer> implements CuentaBancariaDAO {

	public JPACuentaBancariaDAO() {
		super(CuentaBancaria.class);
		
	}

	@Override
	public List<CuentaBancaria> listarCuentas() {
		Query query = this.em.createNamedQuery("listarCuentas");
		@SuppressWarnings("unchecked")
		List<CuentaBancaria> cuentas = query.getResultList();
		
		return cuentas;
	}


}
