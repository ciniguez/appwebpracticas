package test;

import com.modelo.entidades.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class EntityManagerTestSinDAO {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
		EntityManager em = emf.createEntityManager();

		//insertar(em);
		// actualizacion(em);
		// eliminar(em);

		 leer(em);
		// autenticar(em);
		//autenticarNativa(em);

	}

	private static void autenticarNativa(EntityManager em) {
		String sentenciaSQL = "SELECT p.* from Usuario p WHERE p.nombre= 'Luis' AND p.clave= 'luis123'";

		Query query = em.createNativeQuery(sentenciaSQL, Usuario.class);

		Usuario autenticado = (Usuario) query.getSingleResult();
		System.out.println(autenticado);

	}

	private static void autenticar(EntityManager em) {
		String sentenciaJPQL = "SELECT p from Usuario p WHERE p.nombre= :username AND p.clave= :clave";

		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("username", "Luis");
		query.setParameter("clave", "luis123");

		Usuario autenticado = (Usuario) query.getSingleResult();
		System.out.println(autenticado);

	}

	private static void eliminar(EntityManager em) {
		// Quiero actualizar la clave de Carlos

		Usuario carlos = em.find(Usuario.class, 1);

		em.getTransaction().begin();
		em.remove(carlos);
		em.getTransaction().commit();
	}

	private static void actualizacion(EntityManager em) {
		// Quiero actualizar la clave de Carlos

		Usuario carlos = em.find(Usuario.class, 1);

		carlos.setClave("carlos789");

		em.getTransaction().begin();
		em.merge(carlos);
		em.getTransaction().commit();

	}

	private static void leer(EntityManager em) {
		Usuario carlos = em.find(Usuario.class, 1);
		System.out.println(carlos);

	}

	public static void insertar(EntityManager em) {

		Usuario carlos = new Usuario(0, "Luis", "luis123", true);

		em.getTransaction().begin();
		em.persist(carlos);
		em.getTransaction().commit();

	}
}
