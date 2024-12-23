package modelo.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class BddConnection {
	
	private static Connection conn = null;
	
	private BddConnection() {
		String servidor="";
		String database="";
		String usuario="";
		String password="";
		String url = "jdbc:mysql://" + servidor + "/" + database;
		
		//1.- Me conecto con el Driver
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			conn = DriverManager.getConnection(url, usuario, password);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}		
	}
	
	public static Connection getConexion() {
		if (conn == null) {
			new BddConnection();
		}
		return conn;
	}
	
	public static void cerrar( ResultSet rs) {
		try {			
			rs.close();
		}catch(SQLException ex) {
			ex.printStackTrace(System.out);
		}
		rs = null;
		
	}
	
	public static void cerrar( PreparedStatement pstmt) {
		try {
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace(System.out);
		}
	}

	public static void cerrar() {
		if(conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
