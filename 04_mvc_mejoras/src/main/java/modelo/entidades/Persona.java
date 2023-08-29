package modelo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String nombre;
	@Column
	private String password;
	@Column
	private Boolean esadmin;

	// private static List<Persona> personas = null;

	public Persona() {
	}

	public Persona(Integer id, String nombre, String password, boolean esadmin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.esadmin = esadmin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEsadmin() {
		return esadmin;
	}

	public void setEsadmin(Boolean esadmin) {
		this.esadmin = esadmin;
	}
	
}
