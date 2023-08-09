package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Banco")
public class Banco implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nombre_banco")
	private String nombreBanco;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="banco")
	private List<CuentaBancaria> cuentas;
	
	public Banco() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public List<CuentaBancaria> getCuantas() {
		return cuentas;
	}

	public void setCuantas(List<CuentaBancaria> cuantas) {
		this.cuentas = cuantas;
	}
	
	
	
}
