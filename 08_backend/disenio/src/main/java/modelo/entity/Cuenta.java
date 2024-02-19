package modelo.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Carlos Iñiguez
 */
public class Cuenta {
	private Integer id;
	private String nombre;
	
	private static List<Cuenta> cuentas = null;

    public Cuenta() {
    }
    

    public Cuenta(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}


	public static List<Cuenta> getAll() {
    	if(cuentas == null) {
    		cuentas = new ArrayList<Cuenta>();
    		cuentas.add(new Cuenta(1,"BCO. Pichincha"));
    		cuentas.add(new Cuenta(2,"Efectivo"));
    		
    	}
    	return cuentas;
    }

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

	public static List<Cuenta> getCuentas() {
		return cuentas;
	}


	public static Cuenta getById( Integer id) {
		for (Cuenta cuenta : getAll()) {
			if(cuenta.getId().equals(id)) {
				return cuenta;
			}
		}
		return null;
	}

}