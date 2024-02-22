package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Cuenta;

class CuentaTest {

	/*
	 * Dada un id de cuenta, se muestra la cuenta
	 * */
	@Test
	void test() {
		Cuenta c = Cuenta.getById(1);
		assertEquals(c.getNombre(), "PICHINCHA");
		
	}

}
