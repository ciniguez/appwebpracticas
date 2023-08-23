package com.modelo.entities;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
@Entity
public class MovIngreso extends Movimiento implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private Ingreso origen;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REFRESH)
	private IngresoGasto destino;

	public MovIngreso() {

	}
	public MovIngreso(Integer id, String concepto, double valor, Date fecha, IngresoGasto destino, Ingreso origen) {
		super(id, concepto, valor, fecha);
		this.origen = origen;
		this.destino = destino;
	}

	public Ingreso getOrigen() {
		return origen;
	}
	public void setOrigen(Ingreso origen) {
		this.origen = origen;
	}
	public IngresoGasto getDestino() {
		return destino;
	}
	public void setDestino(IngresoGasto destino) {
		this.destino = destino;
	}
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (this.id != null ? this.id.hashCode() : 0);
		return hash;

	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof MovIngreso)) {
			return false;
		}
		MovIngreso other = (MovIngreso) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MovIngreso: " + this.id;
	}

}