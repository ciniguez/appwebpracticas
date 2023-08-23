package com.modelo.entities;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
@Entity
public class Transferencia extends Movimiento implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@ManyToOne(fetch = FetchType.LAZY.EAGER, cascade = CascadeType.REFRESH)
	@JoinColumn
	private IngresoGasto origen;
	@ManyToOne(fetch = FetchType.LAZY.EAGER, cascade = CascadeType.REFRESH)
	@JoinColumn
	private IngresoGasto destino;

	public Transferencia() {

	}
	public Transferencia(Integer id, String concepto, double valor, Date fecha, IngresoGasto origen, IngresoGasto destino) {
		super(id, concepto, valor, fecha);
		this.destino = destino;
		this.origen = origen;
	}	

	public IngresoGasto getOrigen() {
		return origen;
	}


	public void setOrigen(IngresoGasto origen) {
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
		if (!(object instanceof Transferencia)) {
			return false;
		}
		Transferencia other = (Transferencia) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override

	public String toString() {
		return "Transferencia: " + this.id;
	}

}