package com.modelo.jpa;

import java.util.*;

import javax.persistence.*;

import com.modelo.dao.UsuarioDAO;
import com.modelo.entities.Usuario;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO{

	public JPAUsuarioDAO(){
		super(Usuario.class);
	}

	/**
	 * 
	 * @param username
	 * @param clave
	 */
	public Usuario autorizar(String username, String clave){
		return null;
	}

}