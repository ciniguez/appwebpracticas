package com.modelo.jpa;

import java.util.List;

import jakarta.persistence.Query;

import com.modelo.dao.BancoDAO;
import com.modelo.entidades.Banco;

public class JPABancoDAO extends JPAGenericDAO<Banco, Integer> implements BancoDAO {

	public JPABancoDAO() {
		super(Banco.class);
	}

	@Override
	public List<Banco> get() {
		Query query = this.em.createNamedQuery("listarBancos");
		@SuppressWarnings("unchecked")
		List<Banco> bancos = query.getResultList();
		return bancos;
	}
	

	

}
