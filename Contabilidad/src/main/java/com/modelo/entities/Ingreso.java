package com.modelo.entities;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:14
 */
@Entity
public class Ingreso extends Cuenta implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public Ingreso() {}
	public Ingreso(int id, String nombre, double total, Usuario usuario) {
		super(id, nombre, total,usuario);
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

		if (!(object instanceof Ingreso)) {

			return false;

		}

		Ingreso other = (Ingreso) object;

		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {

			return false;

		}

		return true;

	}

	@Override
	public String toString() {

		return "Ingreso: " + this.id;

	}

}