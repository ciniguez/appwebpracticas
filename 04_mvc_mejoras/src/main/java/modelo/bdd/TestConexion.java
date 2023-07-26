package modelo.bdd;

import java.sql.Connection;

public class TestConexion {

	public static void main(String[] args) {
		
		Connection cnn = BddConeccion.getConexion();
		if(cnn != null) {
			System.out.println("Tenemos conexion");
		}else {
			System.out.println("Conexion fallida");
		}

	}

}
