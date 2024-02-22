package test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import entities.Categoria;
import entities.TipoMovimiento;

public class TestCarlos {

	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("persistencia").createEntityManager();
		
		Categoria cat = new Categoria(1, "Nomina", TipoMovimiento.INGRESO);
		em.getTransaction().begin();
		em.persist(cat);
		em.getTransaction().commit();

	}

}
