package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String clave;
	private String username;
	
	private static List<Usuario> listaUsuarios = null; //BDD simulada
	
	public Usuario() {}
	
	

	public Usuario(Integer id, String nombre, String clave, String username) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.username = username;
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
	public static List<Usuario> getUsuarios(){
		if( listaUsuarios == null) {
			listaUsuarios = new ArrayList<Usuario>();
			listaUsuarios.add(new Usuario(1, "Carlos", "carlos123", "ciniguez"));
			listaUsuarios.add(new Usuario(2, "Carla", "carla123", "ctorres"));
			listaUsuarios.add(new Usuario(3, "Juan", "juan123", "jtorres"));
		}
		return listaUsuarios;
	}
	
	public static Usuario autenticarPersona( String usuario, String clave) {
		
		for (Usuario usr : getUsuarios()) {
			if(usr.getNombre().equals(usuario) && usr.getClave().equals(clave)) {
				return usr;
			}
		}	
		return null;
	}
	
	
}
