package modelo.entity;

import java.util.*;

/**
 * @author Carlos Iñiguez
 */
public abstract class Categoria {

	protected Integer id;

    public Categoria(Integer id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
     * 
     */
    protected String nombre;

    /**
     * 
     */
    protected Categoria getCategoria() {
        return null;
    }

    /**
     * 
     */
    protected List<Categoria> getAll() {
    	return null;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
    

}