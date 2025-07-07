package test.orm;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import modelo.entities.Persona;

public class TestOrm {

	public static void main(String[] args) {
		EntityManager em =  Persistence.createEntityManagerFactory("jpaPersona").createEntityManager();
		
		
		insertar(em);
		
		//leer(em);
		
		//actualizar(em);
		
		//eliminar(em);
		
		//consultarJPQL(em);
			
		
	

	}

	private static void consultarJPQL(EntityManager em) {
		
		String sentenciaJPQL = "SELECT p FROM Persona p WHERE p.nombre= :var1 AND p.password= :var2";
		
		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("var1", "Esteban");
		query.setParameter("var2", "este123");
		
		Persona personaAutorizada =  (Persona)query.getSingleResult();
		//query.getResultList()
		
		System.out.println(personaAutorizada);
	}

	private static void eliminar(EntityManager em) {
		Persona p = em.find(Persona.class, 1);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
	}

	private static void actualizar(EntityManager em) {
		Persona p = em.find(Persona.class,1);
		
		p.setNombre("Chilindrina");
		
		em.getTransaction().begin();
		em.merge(p);
		em.getTransaction().commit();
	}

	private static void leer(EntityManager em) {
		Persona p5 = em.find(Persona.class, 1);
		System.out.println(p5);
		
	}

	private static void insertar( EntityManager em) {
		Persona p = new Persona(0, "Esteban", "este123");

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
	}

}
