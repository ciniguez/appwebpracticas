package orm.test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import orm.entities.Banco;
import orm.entities.CuentaBancaria;
import orm.entities.Persona;

public class Test {

	public static void main(String[] args) {

		// Instanciacion del Entity Manager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ormchinchulin");
		EntityManager em = emf.createEntityManager();

		// insertar(em);
		// leer(em);
		//actualizar(em);
		//eliminar(em);
		//persistirData(em);
		//consultaJPQLBasica(em);
		//consultaNativa(em);
		cargarDatosBancos(em);
		

	}

	private static void cargarDatosBancos(EntityManager em) {
		Banco pichincha = new Banco();
		pichincha.setNombreBanco("Pichincha");

		Banco gye = new Banco();
		gye.setNombreBanco("Guayaquil");
		
		em.getTransaction().begin();
		em.persist(pichincha);
		em.persist(gye);
		em.getTransaction().commit();
		
		// Agregar Personas
		Persona carlos = new Persona("Carlos", "carlos123");
		Persona monica = new Persona("Monica", "monica123");
		
		em.getTransaction().begin();
		em.persist(monica);
		em.persist(carlos);
		em.getTransaction().commit();
		
		//Agregar cuentas bancarias
		Banco bcoGye = em.find(Banco.class, 1);
		Persona propietario = em.find(Persona.class, 1);

		CuentaBancaria cta1 = new CuentaBancaria();
		cta1.setNumero("33336565");
		cta1.setTotal(0.0);
		cta1.setBanco(bcoGye);
		cta1.setPropietario(propietario);
		
		em.getTransaction().begin();
		em.persist(cta1);
		em.getTransaction().commit();
		
		
		
		
		
		
	}

	private static void consultaNativa(EntityManager em) {
		String sentenceSQL = "SELECT p.* from persona p WHERE p.nombrepersona= 'Carlos' AND clavepersona='carlos123'";
		
		Query query = em.createNativeQuery(sentenceSQL, Persona.class);
		Persona carlos = (Persona)query.getSingleResult();
		System.out.println(carlos);
		
	}

	private static void consultaJPQLBasica(EntityManager em) {
		
		String sentenceJPQL = "SELECT p FROM Persona p WHERE p.nombre= :nombre AND p.clave= :clave";
		
		Query query= em.createQuery(sentenceJPQL);
		query.setParameter("nombre", "Juan");
		query.setParameter("clave", "juan123");
		
		Persona persona = (Persona) query.getSingleResult();
		
		System.out.println(persona);
		
		
	}

	private static void persistirData(EntityManager em) {
		
		Persona juan = new Persona("Juan", "juan123");
		Persona carlos = new Persona("Carlos", "carlos123");
		Persona monica = new Persona("Monica", "monica123");
		
		em.getTransaction().begin();
		em.persist(monica);
		em.persist(carlos);
		em.persist(juan);
		em.getTransaction().commit();
		
	}

	public static void insertar(EntityManager em) {
	

		// Operacion Insert
		Persona persona1 = new Persona();
		persona1.setClave("carlos123");
		persona1.setNombre("Carlos");

		em.getTransaction().begin();
		em.persist(persona1);
		em.getTransaction().commit();

	}

	public static void leer(EntityManager em) {
	

		// Operacion
		// SELECT * FROM Persona Where id = 1
		Persona carlos = em.find(Persona.class, 1);

		System.out.println(carlos.getNombre());

	}

	public static void actualizar(EntityManager em) {

		// Operacion MERGE

		Persona carlos = em.find(Persona.class, 1);
		carlos.setClave("nuevaClave");

		em.getTransaction().begin();
		em.merge(carlos);
		em.getTransaction().commit();

	}

	public static void eliminar(EntityManager em) {

		Persona carlos = em.find(Persona.class, 1);
		
		em.getTransaction().begin();
		em.remove(carlos);
		em.getTransaction().commit();
	}
}
