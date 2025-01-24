package modelo.SimuladoImplementacionDAO;

import java.util.ArrayList;
import java.util.List;

import modelo.dao.PersonaDAO;
import modelo.entidad.Persona;

public class PersonaImplDAO implements PersonaDAO {
	
	private static List<Persona> personas = null;

	@Override
	public List<Persona> getPersonas() {
		if (personas == null) {
			personas = new ArrayList<Persona>();
			
			for( int i = 0; i<5; i++) {
				personas.add( new Persona( i, "Persona-"+i, "Apellido-"+1));
			}
		}
		
		return personas;
	}

	@Override
	public void addPersona(Persona p) {
		this.getPersonas().add(p);
	}

	@Override
	public void actualizarPersona(Persona p) {
		for(int i= 0; i< this.getPersonas().size(); i++) {
			if( this.getPersonas().get(i).getId()== p.getId() ) {
				this.getPersonas().set(i, p);
				break;
			}
		}
	}

	@Override
	public void eliminarPersona(int id) {
		for(int i= 0; i< this.getPersonas().size(); i++) {
			if( this.getPersonas().get(i).getId() == id ) {
				this.getPersonas().remove(i);
				break;
			}
		}		
	}

	@Override
	public Persona getPersonaById(int id) {
		
		for(int i= 0; i< this.getPersonas().size(); i++) {
			if( this.getPersonas().get(i).getId() == id ) {
				return this.getPersonas().get(i);
			}
		}
		return null;
	}

}
