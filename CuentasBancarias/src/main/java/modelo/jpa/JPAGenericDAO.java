package modelo.jpa;

import java.util.*;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import modelo.dao.GenericDAO;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
public class JPAGenericDAO<T,ID> implements GenericDAO<T,ID> {

	protected EntityManager em;
	private Class<T> persistentClass;

	public JPAGenericDAO(Class<T> clasePersistente){
		em = Persistence.createEntityManagerFactory("carlitosjpa").createEntityManager();
		this.persistentClass = clasePersistente;
	}

	/**
	 * 
	 * @param entity
	 */
	@Override
	public void create(T entity){
		em.getTransaction().begin();
		try {		
			em.persist(entity);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("error de insercion");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

	/**
	 * 
	 * @param entity
	 */
	@Override
	public void delete(T entity){
		em.getTransaction().begin();
		try {		
			em.remove(entity);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("error de eliminar");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}

	/**
	 * 
	 * @param id
	 */
	@Override
	public void deleteById(ID id){
		T entity =  this.getById(id);
		if(entity != null) {
			this.delete(entity);
		}
	}

	@Override
	public List<T> getAll(){
		// Se crea un criterio de consulta
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
		// Se establece la clausula FROM
		Root<T> root = criteriaQuery.from(this.persistentClass);
		// Se establece la clausula SELECT
		criteriaQuery.select(root); // criteriaQuery.multiselect(root.get(atr))
		Query query = em.createQuery(criteriaQuery);
		return query.getResultList();
	}

	/**
	 * 
	 * @param id
	 */
	@Override
	public T getById(ID id){
		return em.find(this.persistentClass, id);
	}

	/**
	 * 
	 * @param entity
	 */
	@Override
	public void update(T entity){
		em.getTransaction().begin();
		try {		
			em.merge(entity);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("error de actualizacion");
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
	}



}