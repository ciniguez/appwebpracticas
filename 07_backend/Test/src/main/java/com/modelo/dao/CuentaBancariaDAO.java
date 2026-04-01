package com.modelo.dao;

import java.util.List;

import com.modelo.entidades.CuentaBancaria;

public interface CuentaBancariaDAO extends GenericDAO<CuentaBancaria, Integer> {
	public List<CuentaBancaria> listarCuentas();
}
