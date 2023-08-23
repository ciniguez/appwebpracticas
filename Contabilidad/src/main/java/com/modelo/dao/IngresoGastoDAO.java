package com.modelo.dao;

import java.util.*;

import javax.persistence.*;

import com.modelo.entities.IngresoGasto;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
public interface IngresoGastoDAO extends GenericDAO<IngresoGasto, Integer>{

	public List<IngresoGasto> getAllConTotales();

}