package com.modelo.jpa;

import java.util.*;

import javax.persistence.*;

import com.modelo.dao.IngresoGastoDAO;
import com.modelo.entities.IngresoGasto;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
public class JPAIngresoGastoDAO extends JPAGenericDAO<IngresoGasto, Integer> implements IngresoGastoDAO {

	public JPAIngresoGastoDAO(){
		super(IngresoGasto.class);
	}

	public List<IngresoGasto> getAllConTotales(){
		return null;
	}

}