package com.modelo.jpa;

import java.util.*;

import javax.persistence.*;

import com.modelo.dao.IngresoGastoDAO;
import com.modelo.dao.MovRecurrenteDAO;
import com.modelo.entities.IngresoGasto;
import com.modelo.entities.MovRecurrente;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
public class JPAMovRecurrenteDAO extends JPAGenericDAO<MovRecurrente, Integer> implements MovRecurrenteDAO {

	public JPAMovRecurrenteDAO(){
		super(MovRecurrente.class);
	}

	/**
	 * 
	 * @param mov
	 */
	private MovRecurrente CalcularSiguienteRecurrencia(MovRecurrente mov){
		return null;
	}

	/**
	 * Registra el movimiento recurrente como un movimiento dentro de la contabilidad
	 * 
	 * @param mov
	 */
	public void registrarComoMovimiento(MovRecurrente mov){

	}

	/**
	 * 
	 * @param id
	 */
	public void delete(int id){

	}

	/**
	 * 
	 * @param mes
	 */
	public List<MovRecurrente> getRecurrenteByMonth(int mes){
		return null;
	}

	/**
	 * 
	 * @param mov
	 */
	public MovRecurrente addMovimientoRecurrente(MovRecurrente mov){
		return null;
	}

}