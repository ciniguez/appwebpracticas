package modelo.jpa;

import java.util.*;

import modelo.dao.BancoDAO;
import modelo.entities.Banco;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
public class JPABancoDAO extends JPAGenericDAO<Banco,Integer> implements BancoDAO {

	public JPABancoDAO(){
		super(Banco.class);
	}


}