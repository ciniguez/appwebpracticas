package com.modelo.dao;

import java.util.*;

import javax.persistence.*;

import com.modelo.entities.Cuenta;
import com.modelo.entities.Gasto;
import com.modelo.entities.Ingreso;
import com.modelo.entities.IngresoGasto;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:14
 */
public interface CuentaDAO extends GenericDAO<Cuenta, Integer> {

	/**
	 * Genera un movimiento cuyo valor es total_actual - valorFinal. Esto har� que el
	 * total de la cuenta sea el valorFinal.
	 * 
	 * @param valorFinal
	 */
	public void ajustarSaldo(double valorFinal);

	/**
	 * 
	 * @param mes
	 */
	public List<Cuenta> getAllConTotalesByMonth(int mes);
	public List<IngresoGasto> getAllConTotales();
	
	public void addCuentaIngreso(Ingreso cuenta);
	public void addCuentaGasto(Gasto cuenta);
	public Ingreso getByIdIngreso(int id);
	public Gasto getByIdGasto(int id);
	public IngresoGasto getByIdIngresoGasto(int id);

}