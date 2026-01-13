package test;


import java.util.List;


import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Banco;
import com.modelo.entidades.CuentaBancaria;
import com.modelo.entidades.Usuario;

public class EntityManagerTest {

	public static void main(String[] args) {
	
		
		// Usuarios
		
		//Personas
		DAOFactory.getFactory().getPersonaDAO().create(new Usuario(0,"Nestor", "nestor123", false));
		DAOFactory.getFactory().getPersonaDAO().create(new Usuario(0,"Luis", "luis123",true));
		DAOFactory.getFactory().getPersonaDAO().create(new Usuario(0,"Pedro", "pedro123",false));
		DAOFactory.getFactory().getPersonaDAO().create(new Usuario(0,"Juan", "juan123",false));
		//Bancos
		DAOFactory.getFactory().getBancoDAO().create(new Banco("BCO. PACIFICO"));
		DAOFactory.getFactory().getBancoDAO().create(new Banco("BCO. PICHINCHA"));
		DAOFactory.getFactory().getBancoDAO().create(new Banco("BCO. AUSTRO"));
		//Cuentas
		Usuario p = DAOFactory.getFactory().getPersonaDAO().getById(1);
		Banco b = DAOFactory.getFactory().getBancoDAO().getById(1);
		DAOFactory.getFactory().getCuentaBancariaDAO().create(new CuentaBancaria("123456789", b, p));
		
		// listar Cuentas bancarias
		List<CuentaBancaria> cuentas = DAOFactory.getFactory().getCuentaBancariaDAO().get();
		for (CuentaBancaria cuentaBancaria : cuentas) {
			System.out.println(cuentaBancaria);
		}
		

	}

}
