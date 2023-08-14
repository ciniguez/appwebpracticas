package modelo.jpa;

import modelo.dao.DAOFactory;
import modelo.dao.PersonaDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public PersonaDAO getPersonaDAO() {
		return new JPAPersonaDAO();
	}

}
