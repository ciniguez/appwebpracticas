package com.modelo.jpa;

import java.util.*;

import javax.persistence.*;

import com.modelo.dao.CuentaDAO;
import com.modelo.entities.Cuenta;
import com.modelo.entities.Gasto;
import com.modelo.entities.Ingreso;
import com.modelo.entities.IngresoGasto;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
public class JPACuentaDAO extends JPAGenericDAO<Cuenta, Integer> implements CuentaDAO{

	public JPACuentaDAO(){
		super(Cuenta.class);
	}

	/**
	 * Genera un movimiento cuyo valor es total_actual - valorFinal. Esto har� que el
	 * total de la cuenta sea el valorFinal.
	 * 
	 * @param valorFinal
	 */
	@Override
	public void ajustarSaldo(double valorFinal){
		
	}

	/**
	 * 
	 * @param mes
	 */
	public List<Cuenta> getAllConTotalesByMonth(int mes){
		return null;
	}

	@Override
	public void addCuentaIngreso(Ingreso cuenta) {
		this.create(cuenta);

	}

	@Override
	public void addCuentaGasto(Gasto cuenta) {
		this.create(cuenta);
	}

	@Override
	public Ingreso getByIdIngreso(int id) {
		return (Ingreso)this.getById(id);
	}

	@Override
	public Gasto getByIdGasto(int id) {
		return (Gasto)this.getById(id);
	}

	@Override
	public IngresoGasto getByIdIngresoGasto(int id) {
		return (IngresoGasto) this.getById(id);
	}

	@Override
	public List<IngresoGasto> getAllConTotales() {
		String JPQL = "SELECT c FROM CUENTA c WHERE c.DTYPE='IngresoGasto'";
		Query query = this.em.createNamedQuery(JPQL);
		return  query.getResultList();
	}


}