package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BddConeccion {
	private static Connection cnn = null;

	private BddConeccion() {
		String servidor = "localhost:8889";
		String database = "gestorpersonas";
		String usuario = "root";
		String password = "root";
		String url = "jdbc:mysql://" + servidor + "/" + database;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			cnn = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion con exito");
		} catch (SQLException e) {
			System.out.println("Error de conexión!!");
			e.printStackTrace();
		}
	}

	public static Connection getConexion() {
		if (cnn == null) {
			new BddConeccion();
		}
		return cnn;
	}

	public static void cerrar(ResultSet rs) {

		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void cerrar(PreparedStatement pstmt) {

		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void cerrar() {

		try {
			if (cnn != null) {
				cnn.close();
				cnn = null;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
