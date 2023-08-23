package com.modelo.entities;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
@Entity
public class MovRecurrente extends Movimiento implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="registro")
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	public MovRecurrente() {

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFechaInicio(Date newVal) {
		fechaInicio = newVal;
	}

	public Date getFechaInicio() {
		return fechaInicio;
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

		if (!(object instanceof MovRecurrente)) {
			return false;
		}
		MovRecurrente other = (MovRecurrente) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MovRecurrente: " + this.id;
	}

}