package modelo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nombrecito")
	private String nombre;
	
	@Column(name="clave")
	private String password;

	public Persona() {

	}

	public Persona(int id, String nombre, String password) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	

	// ********* Métodos (Reglas de Negocio) *******





	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", password=" + password + "]";
	}

	public Persona getPersonaById(int id) {
		// CODIGO PARA JDBC
		return null;
	}

	public void create() {
		// CODIGO PARA JDBC
	}

	public void update(String nombre, String password) {

		// CODIGO PARA JDBC
	}

	public void delete() throws Exception {
		// CODIGO PARA JDBC
	}
}
