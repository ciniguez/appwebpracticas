package PrincipalTest;

import java.util.List;

import modelo.Cuenta;

public class Test {

	public static void main(String[] args) {
		List<Cuenta> lista = Cuenta.getAll();
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		

	}

}
