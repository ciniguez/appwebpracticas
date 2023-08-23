package com.modelo.jpa;

import java.util.*;

import javax.persistence.*;

import com.dto.MovimientoDTO;
import com.modelo.dao.IngresoGastoDAO;
import com.modelo.dao.MovimientoDAO;
import com.modelo.entities.IngresoGasto;
import com.modelo.entities.MovGasto;
import com.modelo.entities.MovIngreso;
import com.modelo.entities.Movimiento;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
public class JPAMovimientoDAO extends JPAGenericDAO<Movimiento, Integer> implements MovimientoDAO {

	public JPAMovimientoDAO() {
		super(Movimiento.class);
	}

	/**
	 * 
	 * @param hasta
	 * @param desde
	 */
	public List<Movimiento> getAllByDate(Date hasta, Date desde) {
		return null;
	}

	/**
	 * 
	 * @param idCuenta
	 */
	public List<MovimientoDTO> getAllByCuenta(int idCuenta) {
		List<MovimientoDTO> resultados = new ArrayList<>();

		String SQL = "SELECT m.ID, m.DTYPE, m.CONCEPTO, c.nombre AS 'DE', p.nombre as 'A', m.fecha,\r\n"
				+ "CASE m.DTYPE\r\n" + "  WHEN 'MovGasto' THEN m.VALOR *(-1) \r\n" + "  WHEN 'Transferencia'\r\n"
				+ "	THEN\r\n" + "		CASE\r\n" + "			WHEN m.ORIGEN_ID= " + idCuenta
				+ " THEN m.VALOR *(-1)\r\n" + "			WHEN m.DESTINO_ID= " + idCuenta + " THEN m.VALOR\r\n"
				+ "		END\r\n" + "	ELSE m.VALOR \r\n" + "END AS 'VALOR'\r\n" + "FROM MOVIMIENTO m \r\n"
				+ "LEFT JOIN CUENTA c ON (m.ORIGEN_ID = c.id) \r\n" + "LEFT JOIN CUENTA p ON (m.DESTINO_ID = p.id)\r\n"
				+ "WHERE m.DESTINO_ID = " + idCuenta + " OR m.ORIGEN_ID = " + idCuenta;
		Query query = this.em.createNativeQuery(SQL);
		query.setParameter("id", idCuenta);

		@SuppressWarnings("unchecked")
		List<Object[]> raw = query.getResultList();

		for (Object[] object : raw) {
			MovimientoDTO resultado = new MovimientoDTO((int) object[0], (String) object[1], (String) object[2],
					(String) object[3], (String) object[4], (Date) object[5], (Double) object[6]);
			resultados.add(resultado);

		}

		return resultados;
	}

	public List<Movimiento> getAll() {
		return null;
	}

	@Override
	public void addIngreso(MovIngreso movIngreso) {
		// this.create(movIngreso);

		try {

			this.em.getTransaction().begin();

			// Guardar el movimiento
			this.em.persist(movIngreso);

			// Actualizar total de la cuenta de Ingreso Gasto
			IngresoGasto cuenta = movIngreso.getDestino();
			cuenta.setTotal(movIngreso.getValor());
			this.em.merge(cuenta);

			this.em.getTransaction().commit();
			
		} catch (IllegalStateException e) {
			if (this.em.getTransaction().isActive())
				this.em.getTransaction().rollback();
		}

	}

	@Override
	public void addGasto(Movimiento egreso) {
		this.create(egreso);
	}

	@Override
	public List<MovimientoDTO> getAllDTO() {
		List<MovimientoDTO> resultados = new ArrayList<>();

		String SQL = "SELECT m.ID, m.DTYPE, m.CONCEPTO, c.nombre as 'DE', p.nombre as 'A', m.fecha,\r\n"
				+ "CASE m.DTYPE\r\n" + "WHEN 'MovGasto' THEN m.VALOR *(-1)\r\n" + "ELSE m.VALOR\r\n"
				+ "END AS 'VALOR'\r\n" + "FROM MOVIMIENTO m\r\n" + "LEFT JOIN CUENTA c ON (m.ORIGEN_ID = c.id)\r\n"
				+ "LEFT JOIN CUENTA p ON (m.DESTINO_ID = p.id);";
		Query query = this.em.createNativeQuery(SQL);

		@SuppressWarnings("unchecked")
		List<Object[]> raw = query.getResultList();

		for (Object[] object : raw) {
			MovimientoDTO resultado = new MovimientoDTO((int) object[0], (String) object[1], (String) object[2],
					(String) object[3], (String) object[4], (Date) object[5], (Double) object[6]);
			resultados.add(resultado);

		}

		return resultados;
	}

}