package test.orm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import modelo.entities.Persona;

public class TestOrm {

	public static void main(String[] args) {
		EntityManager em =  Persistence.createEntityManagerFactory("jpaPersona").createEntityManager();
		
		Persona p = new Persona(0, "Esteban", "este123");
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

	}

}
