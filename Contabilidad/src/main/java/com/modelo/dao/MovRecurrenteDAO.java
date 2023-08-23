package com.modelo.dao;

import java.util.*;

import javax.persistence.*;
import com.modelo.entities.MovRecurrente;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
public interface MovRecurrenteDAO extends GenericDAO<MovRecurrente, Integer> {


	/**
	 * Registra el movimiento recurrente como un movimiento dentro de la contabilidad
	 * 
	 * @param mov
	 */
	public void registrarComoMovimiento(MovRecurrente mov);

	/**
	 * 
	 * @param id
	 */
	public void delete(int id);

	/**
	 * 
	 * @param mes
	 */
	public List<MovRecurrente> getRecurrenteByMonth(int mes);

	/**
	 * 
	 * @param mov
	 */
	public MovRecurrente addMovimientoRecurrente(MovRecurrente mov);

}