package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.modelo.dao.DAOFactory;
import com.modelo.dao.UsuarioDAO;
import com.modelo.entidades.Usuario;

class UsuarioTest {

	UsuarioDAO usuarioDAO = DAOFactory.getFactory().getPersonaDAO();

	@Test
	@DisplayName(value = "Autenticar")
	void autenticarTest() {
		//Given
		String nombre = "Nestor";
		String clave = "nestor123";	
		//When
		Usuario usuario = usuarioDAO.authenticate(nombre, clave);
		//Then
		assertEquals(usuario.getNombre(), nombre);
	}
	@Test
	@DisplayName(value="Listar Personas")
	void listarTest() {
		//Given
		int numeroItems = 4;
		//When
		List<Usuario> resultado = usuarioDAO.get();
		//Then
		assertEquals(resultado.size(), numeroItems);
		
	}

}
