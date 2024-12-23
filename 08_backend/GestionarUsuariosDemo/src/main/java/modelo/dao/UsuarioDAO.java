package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.bdd.BddConnection;
import modelo.entidades.Usuario;

public class UsuarioDAO {

	public UsuarioDAO() {

	}

	/*****
	 * Métodos de Negocio
	 * 
	 * @throws SQLException
	 *****/
	public List<Usuario> getUsuarios() throws SQLException {
		/*
		 * if( listaUsuarios == null) { listaUsuarios = new ArrayList<Usuario>();
		 * listaUsuarios.add(new Usuario(1, "Carlos", "carlos123", "ciniguez"));
		 * listaUsuarios.add(new Usuario(2, "Carla", "carla123", "ctorres"));
		 * listaUsuarios.add(new Usuario(3, "Juan", "juan123", "jtorres")); } return
		 * listaUsuarios;
		 */

		List<Usuario> usuarios = new ArrayList<Usuario>();

		String _SQL_GET_ALL = "SELECT * FROM usuario";

		PreparedStatement pstmt = BddConnection.getConexion().prepareStatement(_SQL_GET_ALL);
		ResultSet rs = pstmt.executeQuery();

		// Iterar el ResultSet para leer los datos
		while (rs.next()) {
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

	public Usuario autenticarPersona(String usuario, String clave) throws SQLException {

		for (Usuario usr : getUsuarios()) {
			if (usr.getUsername().equals(usuario) && usr.getClave().equals(clave)) {
				return usr;
			}
		}
		return null;
	}

	public void crear(Usuario u) throws SQLException {
		List<Usuario> usuarios = new ArrayList<Usuario>();

		String _SQL_INSERT = "INSERT INTO usuario VALUES(nombre, clave, usernmae) VALUES (?,?,?)";

		PreparedStatement pstmt = BddConnection.getConexion().prepareStatement(_SQL_INSERT);
		pstmt.setString(1, u.getNombre());
		pstmt.setString(2, u.getClave());
		pstmt.setString(3, u.getUsername());

		int filas = pstmt.executeUpdate();

		BddConnection.cerrar(pstmt);
		BddConnection.cerrar();

	}

	public void update(Usuario u) throws SQLException {
		/* TODO **/

		String _SQL_INSERT = "UPDATE SET usuario WHERE .....";

		PreparedStatement pstmt = BddConnection.getConexion().prepareStatement(_SQL_INSERT);
		pstmt.setString(1, u.getNombre());
		pstmt.setString(2, u.getClave());
		pstmt.setString(3, u.getUsername());

		int filas = pstmt.executeUpdate();

		BddConnection.cerrar(pstmt);
		BddConnection.cerrar();
	}

	public void delete(Usuario u) throws SQLException {
		
		String _SQL_INSERT = "DELETE FORM usuario WHERE id = ?";

		PreparedStatement pstmt = BddConnection.getConexion().prepareStatement(_SQL_INSERT);
		pstmt.setInt(1, u.getId());


		int filas = pstmt.executeUpdate();

		BddConnection.cerrar(pstmt);
		BddConnection.cerrar();
	}
}
