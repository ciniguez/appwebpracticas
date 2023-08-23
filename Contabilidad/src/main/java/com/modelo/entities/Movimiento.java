package com.modelo.entities;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Movimiento implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id = 0;
	@Column
	protected String concepto;
	@Column
	protected double valor;
	@Column(name="fecha", updatable = true, nullable = false)
	@Temporal(TemporalType.DATE)
	protected Date fecha;

	public Movimiento() {

	}
	

	public Movimiento(Integer id, String concepto, double valor, Date fecha) {
		super();
		this.id = id;
		this.concepto = concepto;
		this.valor = valor;
		this.fecha = fecha;
	}


	/**
	 * 
	 * @param newVal
	 */
	public void setFecha(Date newVal) {
		fecha = newVal;
	}

	public Date getFecha() {
		return fecha;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setValor(double newVal) {
		valor = newVal;
	}

	public double getValor() {
		return valor;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setConcepto(String newVal) {
		concepto = newVal;
	}

	public String getConcepto() {
		return concepto;
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

		if (!(object instanceof Movimiento)) {

			return false;

		}

		Movimiento other = (Movimiento) object;

		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {

			return false;

		}

		return true;

	}

	@Override

	public String toString() {

		return "Movimiento: " + this.id;

	}

}