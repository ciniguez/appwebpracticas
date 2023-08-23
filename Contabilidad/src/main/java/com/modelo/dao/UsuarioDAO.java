package com.modelo.dao;

import java.util.*;

import javax.persistence.*;
import com.modelo.entities.Usuario;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
public interface UsuarioDAO extends GenericDAO<Usuario, Integer> {

	/**
	 * 
	 * @param username
	 * @param clave
	 */
	public Usuario autorizar(String username, String clave);

}