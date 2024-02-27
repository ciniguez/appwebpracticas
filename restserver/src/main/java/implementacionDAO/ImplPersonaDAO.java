package implementacionDAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dao.PersonaDAO;
import modelo.Persona;

public class ImplPersonaDAO implements PersonaDAO{

	private static List<Persona> personas = null;
	
	
	@Override
	public List<Persona> getPersonas() {
		if(personas == null) {
			personas = new ArrayList<>();
			personas.add(new Persona(1, "Cesar", "Rodriguez"));
			personas.add(new Persona(2, "Pepa", "Vivanco"));
		}
		return personas;
	}

	@Override
	public void addPersona(Persona p) {
		personas.add(p);
	}

	@Override
	public Persona getPersonaById(int id) {
		List<Persona> personas = this.getPersonas();
		for (Persona persona : personas) {
			if(persona.getId().equals(id)) {
				return persona;
			}
		}
		return null;
	}

	@Override
	public void actualizar(Persona p) {
		for(int i = 0; i<=personas.size(); i++) {
			if(this.getPersonas().get(i).getId().equals(p.getId())) {
				this.getPersonas().set(i, p);
			}
		}
	}

	@Override
	public void eliminar(int id) {
		for(int i = 0; i<=personas.size(); i++) {
			if(this.getPersonas().get(i).getId()==id) {
				this.getPersonas().remove(i);
			}
		}
	}

}
