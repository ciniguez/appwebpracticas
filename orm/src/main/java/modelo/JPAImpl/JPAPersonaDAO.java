package modelo.JPAImpl;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import modelo.dao.PersonaDAO;
import modelo.entities.Persona;

public class JPAPersonaDAO implements PersonaDAO {

	private EntityManager em;

	public JPAPersonaDAO() {
		em = Persistence.createEntityManagerFactory("jpaPersona").createEntityManager();

	}

	@Override
	public Persona autorizar(String nombre, String clave) {
		String sentenciaJPQL = "SELECT p FROM Persona p WHERE p.nombre= :var1 AND p.password= :var2";

		Query query = em.createQuery(sentenciaJPQL);
		query.setParameter("var1", nombre);
		query.setParameter("var2", clave);

		return (Persona) query.getSingleResult();

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Persona> getPersonas() {
		String sentenciaJPQL = "SELECT p FROM Persona p";

		Query query = em.createQuery(sentenciaJPQL);

		return (List<Persona>) query.getResultList();

	}

	@Override
	public Persona getPersonaById(int id) {
		return em.find(Persona.class, id);

	}

	@Override
	public void create(Persona p) {
		
		em.getTransaction().begin();
		try {
			em.persist(p);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("Error en guardar");
			em.getTransaction().rollback();
		}

	}

	@Override
	public void update(Persona p) {
		Persona persona = em.find(Persona.class, p.getId());

		persona.setNombre(p.getNombre());
		persona.setPassword(p.getPassword());

		em.getTransaction().begin();
		em.merge(persona);
		em.getTransaction().commit();

	}

	@Override
	public void delete(int id) {
		Persona p = em.find(Persona.class, id);

		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();

	}

}
