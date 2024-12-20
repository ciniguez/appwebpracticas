package modelo;

import java.io.Serializable;
import java.util.List;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String clave;
	private String username;
	
	public Usuario() {}

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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	/***** Métodos de Negocio *****/
	public List<Usuario> getUsuarios(){
		return null;
	}
	
	
	
}
