package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Cuenta;

class CuentaTest {

	@Test
	void testGetById() {
		Cuenta cuenta = Cuenta.getById(2);
		assertEquals(30, cuenta.getTotal());
	}

}
