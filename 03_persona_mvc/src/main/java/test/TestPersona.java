package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Persona;

class TestPersona {

	//Yo como usuario quiero autorizarme t.... para .....
	@Test
	void test() {
		// usuario y clave dada
		String  nombre = "Carlos";
		String password = "carlos123";
		
		Persona p = new Persona();
		Persona personaAutorizada =  p.autorizar(nombre, password);
		
		//Validación
		assertTrue("Usuario autorizado", personaAutorizada != null);

	}

}
