package modelo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
	private String password;
	
	private static List<Persona> personas = null;

	public Persona () {
		
	}
	public Persona(int id, String nombre, String password) {
		this.id = id;
		this.nombre = nombre;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
	
	// ********* Métodos (Reglas de Negocio) *******
	
	public List<Persona> getPersonas(){
		if (personas == null) {
			personas = new ArrayList<Persona>();
			personas.add(new Persona(1, "Carlos", "carlos123"));
			personas.add(new Persona(2, "Pedro", "pedro123"));
			personas.add(new Persona(3, "Maria", "maria123"));
		}
		return personas;
	}
	
	public Persona autorizar(String nombre, String clave) {
		
		Persona personaAutorizada = null;
		List<Persona> personas = this.getPersonas();
		for (Persona persona : personas) {
			if (persona.getNombre().equals(nombre) && persona.getPassword().equals(clave)) {

				personaAutorizada = persona;
				break;
			}
		}
		return personaAutorizada;
		

	}

	public Persona getPersonaById(int id) {
		Persona personaEncontrada = null;
		for (Persona persona : this.getPersonas()) {
			if (persona.getId() == id) {
				personaEncontrada = persona;
				break;
			}
		}
		return personaEncontrada;
	
	}
	public boolean create() {
		//Generación del id (numero mas alto + 1 en el array)
		int max = 0;
		for (Persona persona : personas) {
			if (max< persona.getId()) 
				max = persona.getId();
		}
		this.setId(max + 1);
		
		
		return personas.add(this);
	}

	public void update(String nombre, String password) {
		
		List<Persona> listPersonas = this.getPersonas();
		
		
		for (int i = 0; i < listPersonas.size(); i++) {
			if (listPersonas.get(i).getId() == this.getId()) {
				listPersonas.get(i).setNombre(nombre);
				listPersonas.get(i).setPassword(password);
				break;
			}
		}
	}

	public Persona delete() throws Exception {
		if(this.id == 1 ) {
			throw new Exception("Lo siento: Un Administrador no puede ser eliminado.");
		}else {
			
			int indice = 0;
			List<Persona> listPersonas = this.getPersonas();
			for (int i = 0; i < listPersonas.size(); i++) {
				if (listPersonas.get(i).getId() == this.id) {
					indice = i;
					break;
				}
			}
			return listPersonas.remove(indice);
		}
	}
}
