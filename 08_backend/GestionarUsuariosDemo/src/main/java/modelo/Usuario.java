package modelo;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.bdd.BddConnection;

public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String clave;
	private String username;
	
	//private static List<Usuario> listaUsuarios = null; //BDD simulada
	
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
	/***** Métodos de Negocio 
	 * @throws SQLException *****/
	public static List<Usuario> getUsuarios() throws SQLException{
		/*
		if( listaUsuarios == null) {
			listaUsuarios = new ArrayList<Usuario>();
			listaUsuarios.add(new Usuario(1, "Carlos", "carlos123", "ciniguez"));
			listaUsuarios.add(new Usuario(2, "Carla", "carla123", "ctorres"));
			listaUsuarios.add(new Usuario(3, "Juan", "juan123", "jtorres"));
		}
		return listaUsuarios;
		*/
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		String _SQL_GET_ALL = "SELECT * FROM usuario";
		
		PreparedStatement pstmt = BddConnection.getConexion().prepareStatement(_SQL_GET_ALL);
		ResultSet rs = pstmt.executeQuery();
		
		//Iterar el ResultSet para leer los datos
		while(rs.next()) {
			Usuario u = new Usuario();
			u.setClave(rs.getString("clave"));
			u.setId(rs.getInt("id"));
			u.setNombre(rs.getString("nombre"));
			u.setUsername(rs.getString("username"));
			
			usuarios.add(u);
		}
		
	
		BddConnection.cerrar(rs);
		BddConnection.cerrar(pstmt);
		BddConnection.cerrar();
		
		return usuarios;
		
	}
	
	public static Usuario autenticarPersona( String usuario, String clave) throws SQLException {
		
		for (Usuario usr : getUsuarios()) {
			if(usr.getUsername().equals(usuario) && usr.getClave().equals(clave)) {
				return usr;
			}
		}	
		return null;
	}
	
	
}
