package com.modelo.dao;

import java.util.*;

import javax.persistence.*;
import com.modelo.entities.Transferencia;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
public interface TransferenciaDAO {

	/**
	 * 
	 * @param transf
	 */
	public void transferir(Transferencia transf);

}