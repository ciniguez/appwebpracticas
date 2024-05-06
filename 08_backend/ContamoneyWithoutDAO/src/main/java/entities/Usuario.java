package entities;

import java.io.Serializable;

/**
 * @author Carlos Iñiguez
 */
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;


	/**
     * Default constructor
     */
    public Usuario() {
    }

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String clave;

    
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


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	/**
     * @param nombre 
     * @param clave 
     * @return
     */
    public Usuario autenticar(String nombre, String clave) {
        // TODO implement here
        return null;
    }

}