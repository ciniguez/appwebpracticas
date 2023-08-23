package Test;

import java.util.Date;
import java.util.List;

import com.dto.MovimientoDTO;
import com.modelo.dao.DAOFactory;
import com.modelo.entities.*;

public class Principal {

	public static void main(String[] args) {
		//DAOFactory.getFactory().getUsuarioDAO().create(new Usuario(0,"Carlos","Carlos","carlos123"));
		//crearCuentas();
		//crearMovimientos();
		//desplegarMovimientos();
		desplegarDashboard();
	}
	public static void crearCuentas() {
		Usuario u = DAOFactory.getFactory().getUsuarioDAO().getById(1);
		//DAOFactory.getFactory().getCuentaDAO().create(new Ingreso(0, "Pichincha", 0 , u));
		DAOFactory.getFactory().getCuentaDAO().create(new Ingreso(0, "Nomina", 0 , u));
		DAOFactory.getFactory().getCuentaDAO().create(new IngresoGasto(0, "Pichincha", 0 , u));
		DAOFactory.getFactory().getCuentaDAO().create(new IngresoGasto(0, "Efectivo", 0 , u));
		DAOFactory.getFactory().getCuentaDAO().create(new Gasto(0, "Comida", 0 , u));
		DAOFactory.getFactory().getCuentaDAO().create(new Gasto(0, "Salud", 0 , u));
	}
	public static void crearMovimientos() {
		//Ingreso 1000 a Pichincha por motivos de Nomina
		IngresoGasto origen = DAOFactory.getFactory().getCuentaDAO().getByIdIngresoGasto(2);
		Ingreso destino = DAOFactory.getFactory().getCuentaDAO().getByIdIngreso(1);
		DAOFactory.getFactory().getMovimientoDAO().addIngreso( new MovIngreso(0, "Pago de Nomina", 1000, new Date(),origen, destino) );
		//Egreso 10 de Pichincha por motivos de Comida
		Gasto destinoGasto = DAOFactory.getFactory().getCuentaDAO().getByIdGasto(4);
		DAOFactory.getFactory().getMovimientoDAO().addGasto( new MovGasto(0, "Almuerzo", 10, new Date(), origen, destinoGasto) );
		//Transferencia de 400 de Pichincha a Efectivo
		IngresoGasto origenT = DAOFactory.getFactory().getCuentaDAO().getByIdIngresoGasto(2);
		IngresoGasto destinoT = DAOFactory.getFactory().getCuentaDAO().getByIdIngresoGasto(3);
		Transferencia t = new Transferencia(0,"Llenado de caja", 400, new Date(), origenT,destinoT); 
		DAOFactory.getFactory().getTransferenciaDAO().transferir(t);
		
		
	};
	public static void desplegarMovimientos() {
		//Todas las cuentas de gasto
		List<MovimientoDTO> resultados = DAOFactory.getFactory().getMovimientoDAO().getAllDTO();
		for (Object movimientoDTO : resultados) {
			System.out.println(movimientoDTO);
		}
		//cueta Pichincha
		System.out.println("SOLO PICHINCHA");
		List<MovimientoDTO> pichincha = DAOFactory.getFactory().getMovimientoDAO().getAllByCuenta(3);
		for (Object movimientoDTO : pichincha) {
			System.out.println(movimientoDTO);
		}
		//Todas las cuentas 
	};
	public static void desplegarDashboard() {
		List<Cuenta> cuentasTotalizadas = DAOFactory.getFactory().getCuentaDAO().getAll();
	}
}
