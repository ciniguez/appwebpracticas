package entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;

/**
 * @author Carlos Iñiguez
 */
@Entity
@Table(name="Categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;


	/**
     * Default constructor
     */
    public Categoria() {
    }

    
    public Categoria(Integer id, String nombre, TipoMovimiento tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Integer id;

    @Column
    private String nombre;

    @Enumerated
    private TipoMovimiento tipo;

    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoMovimiento getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimiento tipo) {
		this.tipo = tipo;
	}

	/**
     * @param categoria 
     * @return
     */
    public boolean create(Categoria categoria) {
        // TODO implement here
        return false;
    }

    /**
     * @param idCategoria 
     * @return
     */
    public static Categoria getById(int idCategoria) {
    	return null;
    }

    /**
     * @return
     */
    public List<Categoria> getAll() {
        // TODO implement here
        return null;
    }

    /**
     * @param categoria 
     * @return
     */
    public boolean update(Categoria categoria) {
        // TODO implement here
        return false;
    }

    /**
     * @param idCategoria 
     * @return
     */
    public boolean delete(int idCategoria) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    @SuppressWarnings("unchecked")
	public static List<Categoria> getAllOfIngresoType() {
    	EntityManager em = Persistence.createEntityManagerFactory("persistencia").createEntityManager();
    	String consultaJPQL = "SELECT t FROM Categoria t WHERE t.tipo= :mitipo";
    	Query query =  em.createQuery(consultaJPQL);
    	query.setParameter("mitipo", TipoMovimiento.INGRESO);
    	
    	return (List<Categoria>)query.getResultList();
    	
    }

    /**
     * @return
     */
    public List<Categoria> getAllOfExpenseType() {
        // TODO implement here
        return null;
    }

    /**
     * @param fecha  
     * @return
     */
    public static List<Categoria> getSumarizedByDate(int mes ) {
        
        return null;
    }

}