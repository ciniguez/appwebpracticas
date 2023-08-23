package com.modelo.jpa;

import java.util.*;

import javax.persistence.*;

import com.modelo.dao.GastoDAO;
import com.modelo.entities.Gasto;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
public class JPAGastoDAO extends JPAGenericDAO<Gasto, Integer> implements GastoDAO{

	public JPAGastoDAO(){
		super(Gasto.class);
	}

}