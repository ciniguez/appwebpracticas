package modelo.service;

import java.sql.SQLException;
import java.util.List;

import modelo.dao.UsuarioDAO;
import modelo.entidades.Usuario;

public class UsuarioService {

	public List<Usuario> obtenerTodosLosUsuario() throws SQLException{
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		return usuarioDAO.getUsuarios();
		
		
	}
	
	public void transferir() {
		
		
	}
}
