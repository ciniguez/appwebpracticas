package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Conexión a una Base de Datos MySQL
 */
public class ConexionBDD {

	private static Connection conn = null;
	

	private ConexionBDD() {
		String servidor = "localhost:8889";
		String database = "personas";
		String usuario = "root";
		String password = "root";
		String url = "jdbc:mysql://" + servidor + "/" + database;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conectado!!");
		} catch ( SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Connection getConexion() {
		if (conn == null) {
			new ConexionBDD();
		}
		return conn;
	}

	/**
	 * Cierra un ResultSet
	 * 
	 * @param rs
	 */
	public static void cerrar(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
		rs = null;
	}

	/**
	 * Cierra un PreparedStatement
	 * @param pstmt
	 */
	public static void cerrar(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace(System.out);
		}
		pstmt = null;
	}

	/**
	 * Cierra la conexiòn activa
	 */
	public static void cerrar() {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
				System.out.println("Conexion cerrada con éxito!");
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
