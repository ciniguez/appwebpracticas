package entities;

import java.io.Serializable;
import java.util.*;

/**
 * @author Carlos Iñiguez
 */
public class Contabilidad implements Serializable {

    private static final long serialVersionUID = 1L;


	/**
     * Default constructor
     */
    public Contabilidad() {
    }

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private List<Cuenta> cuentas;

    /**
     * 
     */
    private List<Movimiento> movimientos;

    /**
     * 
     */
    private Usuario propietario;

    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public void setPropietario(Usuario propietario) {
		this.propietario = propietario;
	}

	/**
     * @return
     */
    public List<Categoria> getAllCategories() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public List<Movimiento> getAllMovements() {
        // TODO implement here
        return null;
    }

}