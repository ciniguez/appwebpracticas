package modelo.entities;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.conexion.ConexionBDD;

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
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
