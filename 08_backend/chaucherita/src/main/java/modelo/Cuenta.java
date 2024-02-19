package modelo;

import java.util.*;

/**
 * @author Carlos Iñiguez
 */
public class Cuenta {

	private static List<Cuenta> cuentas = null;
    /**
     * Default constructor
     */
    public Cuenta() {
    }
    

    public Cuenta(String nombre, Integer id) {
		this.nombre = nombre;
		this.id = id;
	}


	/**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    public static List<Cuenta> getAll() {
    	if(cuentas == null) {
    		cuentas = new ArrayList<Cuenta>();
    		cuentas.add(new Cuenta("Pichincha", 1));
    		cuentas.add(new Cuenta("Efectivo", 2));
    		
    	}
        return  cuentas;
    }

    /**
     * @param id
     */
    public static Cuenta getById(int id) {
    	for (Cuenta cuenta : cuentas) {
    		if(cuenta.getId()==id) {
    			return cuenta;
    		}
		}
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


	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", id=" + id + "]";
	}
	
    

}