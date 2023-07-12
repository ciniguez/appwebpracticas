package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nombre;
	private String password;

	private static List<Persona> personas = null;

	public Persona() {
	}

	public Persona(Integer id, String nombre, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// REGLAS DEL NEGOCIO

	public Persona autorizar(String usuario, String password) {
		Persona personaAutorizada = null;
		
		List<Persona> listaPersonas =  this.getPersonas();
		
		for (Persona persona : listaPersonas) {
			if (persona.getNombre().equals(usuario) && 
					persona.getPassword().equals( password)) {
				
				personaAutorizada = persona;
				break;
			}
		}
		
		return personaAutorizada;
	}

	public List<Persona> getPersonas() {
		if (personas == null) {
			personas = new ArrayList<>();

			personas.add(new Persona(1, "Carlos", "carlos123"));
			personas.add(new Persona(2, "Liz", "liz123"));
			personas.add(new Persona(3, "Maria", "maria123"));
			personas.add(new Persona(4, "Juan", "juan123"));
		}
		return personas;
	}

	public Persona getById(int id) {

		Persona p = null;

		List<Persona> listPersonas = this.getPersonas();

		for (Persona persona : listPersonas) {
			if (persona.getId() == id) {
				p = persona;
				break;
			}
		}

		return p;
	}

	public void create(Persona p) {
		this.getPersonas().add(p);

	}

	public void update(Persona p) {
		List<Persona> listaPersonas = this.getPersonas();

		for (int i = 0; i < listaPersonas.size(); i++) {
			if (listaPersonas.get(i).getId() == p.getId()) {
				listaPersonas.get(i).setNombre(p.getNombre());
				listaPersonas.get(i).setPassword(p.getPassword());
				break;
			}
		}
	}

	public void delete(int id) {
		List<Persona> listaPersonas = this.getPersonas();

		for (int i = 0; i < listaPersonas.size(); i++) {
			if (listaPersonas.get(i).getId() == id) {
				listaPersonas.remove(i);
				break;
			}
		}
	}

}
