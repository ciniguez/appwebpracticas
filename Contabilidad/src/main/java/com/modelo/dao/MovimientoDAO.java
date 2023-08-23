package com.modelo.dao;

import java.util.*;

import javax.persistence.*;

import com.dto.MovimientoDTO;
import com.modelo.entities.MovGasto;
import com.modelo.entities.MovIngreso;
import com.modelo.entities.Movimiento;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
public interface MovimientoDAO extends GenericDAO<Movimiento, Integer> {

	public List<Movimiento> getAllByDate(Date hasta, Date desde);

	public List<MovimientoDTO> getAllByCuenta(int idCuenta);
	public List<MovimientoDTO> getAllDTO();

	public List<Movimiento> getAll();
	
	/**
	 * 
	 * @param movIngreso
	 */
	public void addIngreso(MovIngreso movIngreso);
	/**
	 * 
	 * @param egreso
	 */
	public void addGasto(Movimiento egreso);

}