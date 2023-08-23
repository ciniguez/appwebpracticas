package com.modelo.entities;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:14
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Cuenta implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id = 0;
	@Column
	protected String nombre;
	@Column
	protected double total;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn
	protected Usuario usuario;

	public Cuenta() {

	}
	

	public Cuenta(Integer id, String nombre, double total, Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.total = total;
		this.usuario = usuario;
	}


	/**
	 * 
	 * @param newVal
	 */
	public void setTotal(double newVal) {
		total = newVal;
	}

	public double getTotal() {
		return total;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNombre(String newVal) {
		nombre = newVal;
	}

	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setId(Integer newVal) {
		id = newVal;
	}

	public Integer getId() {
		return id;
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

		if (!(object instanceof Cuenta)) {

			return false;

		}

		Cuenta other = (Cuenta) object;

		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {

			return false;

		}

		return true;

	}

	@Override

	public String toString() {

		return "Cuenta: " + this.id;

	}

}