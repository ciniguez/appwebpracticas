package pruebas;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import modelo.Banco;

public class EntityManagerTest {

	public static void main(String[] args) {
		
		//insertar();
		leer();
	

	}

	private static void leer() {
		EntityManager em =Persistence.createEntityManagerFactory("miprimerachamba").createEntityManager();
		
		Banco banco =em.find(Banco.class, 1);
		System.out.println(banco);
		
	}

	private static void insertar() {
		EntityManager em =Persistence.createEntityManagerFactory("miprimerachamba").createEntityManager();
		
		Banco pichincha = new Banco("Pichincha");
		
		em.getTransaction().begin();
		em.persist(pichincha);
		em.getTransaction().commit();
		
	}

}
