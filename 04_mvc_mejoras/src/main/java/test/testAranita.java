package test;

import modelo.dao.DAOFactory;
import modelo.entidades.Persona;

public class testAranita {

	public static void main(String[] args) {
		/*
		Persona p = new Persona(0, "Carlos", "carlos123", true);
		DAOFactory.getFactory().getPersonaDAO().create(p);
		*/
		Persona persona =  DAOFactory.getFactory().getPersonaDAO().autorizar("Carlos", "carlos123");
		if(persona!= null) {
			System.out.println(persona);
		}else {
			System.out.println("No existe usuario");
		}

	}

}
