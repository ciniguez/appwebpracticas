package impl;

import java.util.ArrayList;
import java.util.List;

import dao.PersonaDAO;
import modelo.Persona;

public class ImplPersonaDAO implements PersonaDAO {

	private  static List<Persona> personas = null;
	@Override
	public Persona getById(int id) {
		List<Persona> migente =  this.getPersonas();
		for (Persona persona : migente) {
			if(persona.getId() == id) {
				return persona;
			}
			
		}
		return null;
	}

	@Override
	public List<Persona> getPersonas() {
		if(personas == null) {
			personas = new ArrayList();
			personas.add(new Persona(1, "Carlos", "Magno"));
			personas.add(new Persona(2, "Alejandro", "Magno"));
			personas.add(new Persona(3, "Atila", "el grande"));
		}
		return personas;
	}

	@Override
	public void addPersona(Persona p) {
		this.getPersonas().add(p);
	}

	@Override
	public void actualizar(Persona p) {
		for(int i = 0; i < this.getPersonas().size(); i++) {
			if(this.getPersonas().get(i).getId() == p.getId()) {
				this.getPersonas().set(i, p);
			}
		}

	}

	@Override
	public void eliminar(int id) {
		for(int i = 0; i < this.getPersonas().size(); i++) {
			if(this.getPersonas().get(i).getId() == id) {
				this.getPersonas().remove(i);
			}
		}
	}

}
