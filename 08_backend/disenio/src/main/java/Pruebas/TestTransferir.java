package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import modelo.entity.Cuenta;
import modelo.entity.Transferencia;

class TestTransferir {

	@Test
	void test() {
		/* Usuario ingresa una transacción: parametros recibidos */
		int idCtaOrigen = 1;
		int idCtaDestino = 2;
		String concepto = "Llenado de Caja";
		Date fecha = new Date();

		// Hablar con Modelos
		Transferencia t = new Transferencia(Cuenta.getById(idCtaOrigen), Cuenta.getById(idCtaDestino), 100, concepto,
				fecha);
		t.save();
		//Comprobacion
		int resultado = Transferencia.getMovimientos().size();
		assertEquals(1, resultado, "El resultado debería ser 1");

	}

}
