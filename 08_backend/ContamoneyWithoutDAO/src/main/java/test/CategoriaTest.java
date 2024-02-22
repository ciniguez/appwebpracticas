package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import entities.Categoria;

class CategoriaTest {

	@Test
	void test() {
		List<Categoria> categorias = Categoria.getAllOfIngresoType();
		assertEquals(1, categorias.size());
	}

}
