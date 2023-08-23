package com.modelo.jpa;

import java.util.*;

import javax.persistence.*;

import com.modelo.dao.TransferenciaDAO;
import com.modelo.entities.Transferencia;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
public class JPATransferenciaDAO extends JPAGenericDAO<Transferencia, Integer> implements TransferenciaDAO {

	public JPATransferenciaDAO(){
		super(Transferencia.class);
	}

	/**
	 * 
	 * @param transf
	 */
	public void transferir(Transferencia transf){
		this.create(transf);
	}

}