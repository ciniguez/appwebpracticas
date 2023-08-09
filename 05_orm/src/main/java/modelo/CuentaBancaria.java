package modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cuenta")
public class CuentaBancaria implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="numero")
	private String numero;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="banco")
	private Banco banco;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name="propietario")
	private Persona propietario;
	
	public CuentaBancaria () {}

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

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	
	
	
}
