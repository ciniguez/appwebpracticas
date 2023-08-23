package com.modelo.entities;

import java.util.*;

import javax.persistence.*;

import org.eclipse.jdt.internal.compiler.ast.SuperReference;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:14
 */
@Entity
public class Gasto extends Cuenta implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	public Gasto() {

	}
	public Gasto(int id, String nombre, double total, Usuario usuario) {
		super(id, nombre, total, usuario);
	}

	@Override
	public int hashCode() {

		int hash = 0;

		hash += (super.getId() != null ? super.getId().hashCode() : 0);

		return hash;

	}

	@Override

	public boolean equals(Object object) {

		// TODO: Warning - this method won't work in the case the id fields are not set

		if (!(object instanceof Gasto)) {

			return false;

		}

		Gasto other = (Gasto) object;

		if ((this.getId() == null && other.getId() != null)
				|| (this.getId() != null && !this.getId().equals(other.getId()))) {

			return false;

		}

		return true;

	}

	@Override

	public String toString() {

		return "Gasto: " + this.getId();

	}

}