package com.modelo.entidades;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * Entity implementation class for Entity: NumeroTelefono
 *
 */
@Entity
@Table(name="Cuenta")
@NamedQueries({
	@NamedQuery(name = "listarCuentas", query = "SELECT c FROM CuentaBancaria c")
})
public class CuentaBancaria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id_cuenta")
	private Integer id;
	
	@Column(name="numero")
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "bano")
	private Banco banco;
	
	@ManyToOne
	@JoinColumn (name="propietario")
	private Usuario propietario;

	public CuentaBancaria() {

	}

	
	public CuentaBancaria(String numero, Banco banco, Usuario propietario) {
		this.numero = numero;
		this.banco = banco;
		this.propietario = propietario;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Banco getBanco() {
		return banco;
	}


	public void setBanco(Banco banco) {
		this.banco = banco;
	}


	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CuentaBancaria)) {
			return false;
		}
		CuentaBancaria other = (CuentaBancaria) obj;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "CUENTA : "+ this.getNumero() + " BANCO: " + this.banco.getNombreBanco() + " PROPIETARIO: " + this.propietario;
	}

}
