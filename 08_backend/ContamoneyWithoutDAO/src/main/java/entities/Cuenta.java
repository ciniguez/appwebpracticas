package entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
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
@Table(name="Cuenta")
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    


	/**
     * Default constructor
     */
    public Cuenta() {
    	
    }

    
    public Cuenta(String nombre, double total) {
		super();
		this.nombre = nombre;
		this.total = total;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCuenta")
    private Integer id;

	@Column(name="nombre")
    private String nombre;

	@Column(name="total")
    private double total;

    
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	/**
     * @param nombre
     */
    public void Cuenta(String nombre) {
        // TODO implement here
    }

    /**
     * @param idCuenta 
     * @return
     */
    public static Cuenta getById(int idCuenta) {
    	return null;
    }

    /**
     * @return
     */
    @SuppressWarnings("unchecked")
	public static List<Cuenta> getAll() {
    	return null;
    }

    /**
     * @return
     */
    @SuppressWarnings("unchecked")
	public static List<Cuenta> getSumarized() {
    	return null; 
    	}

    /**
     * @param cuenta 
     * @return
     */
    public boolean update(Cuenta cuenta) {
        // TODO implement here
        return false;
    }

    /**
     * @param idCuenta 
     * @return
     */
    public boolean delete(int idCuenta) {
        // TODO implement here
        return false;
    }

    /**
     * @param valor
     */
    public void ajustarSaldo(double valor) {
        // TODO implement here
    }

}