package modelo.JDBCImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.conexion.ConexionBDD;
import modelo.dao.PersonaDAO;
import modelo.entities.Persona;

public class JDBCPersonaDAO implements PersonaDAO{

	@Override
	public Persona autorizar(String nombre, String clave) {
		String SQL_AUTORIZAR = "SELECT * FROM persona WHERE nombre = ? and clave = ?";
		Persona personaAutorizada = null;

		PreparedStatement pstmt;
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_AUTORIZAR);
			pstmt.setString(1, nombre);
			pstmt.setString(2, clave);

			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				personaAutorizada = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("clave"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return personaAutorizada;
	}

	@Override
	public List<Persona> getPersonas() {
String SQL_SELECT = "SELECT * FROM persona";
		
		List<Persona> usuarios = new ArrayList<>(); // Para retornar el resultado
		
		PreparedStatement pstmt;
		try {
			pstmt = ConexionBDD.getConexion().prepareStatement(SQL_SELECT);


			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				usuarios.add(new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("clave")));
				
			}
			
			ConexionBDD.cerrar(pstmt);
			ConexionBDD.cerrar(rs);
			ConexionBDD.cerrar();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		return usuarios;
	}

	@Override
	public Persona getPersonaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Persona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Persona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
