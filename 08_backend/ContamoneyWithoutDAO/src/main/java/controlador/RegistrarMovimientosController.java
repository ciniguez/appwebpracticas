package controlador;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Categoria;
import entities.Cuenta;
import entities.Movimiento;
import entities.TipoMovimiento;

/**
 * @author Carlos Iñiguez
 */
@WebServlet("/RegistrarMovimientosController")
public class RegistrarMovimientosController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ruteador(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ruteador(request, response);
	}

	private void ruteador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ruta = (request.getParameter("ruta") != null) ? request.getParameter("ruta") : "ver";

		// System.out.println(ruta);
		switch (ruta) {
		case "guardaringreso":
			guardarIngreso(request, response);
			break;
		case "guardaregreso":
			guardarEgreso(request, response);
			break;
		case "guardartransferencia":
			guardarTransferencia(request, response);
			break;
		case "eliminaringreso":
			eliminarIngreso(request, response);
			break;
		case "eliminargasto":
			eliminarGasto(request, response);
			break;
		case "nuevoingreso":
			nuevoIngreso(request, response);
			break;
		case "nuevogasto":
			nuevoGasto(request, response);
			break;
		case "nuevatransferencia":
			nuevaTransferencia(request, response);
			break;
		default:
			response.sendRedirect("DashboardController");

		}

	}

	private void nuevaTransferencia(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void nuevoGasto(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void nuevoIngreso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Categoria> categorias = Categoria.getAllOfIngresoType();
		int idCuenta = Integer.parseInt(request.getParameter("idCuenta"));

		Cuenta cta = Cuenta.getById(idCuenta);

		request.setAttribute("categorias", categorias);
		request.setAttribute("cuenta", cta);
		request.getRequestDispatcher("/jsp/ingreso.jsp").forward(request, response);
	}

	private void eliminarGasto(HttpServletRequest request, HttpServletResponse response) {

	}

	private void eliminarIngreso(HttpServletRequest request, HttpServletResponse response) {

	}

	private void guardarTransferencia(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void guardarEgreso(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void printParametersRequest(HttpServletRequest request) {
		Map m = request.getParameterMap();
		Set s = m.entrySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			@SuppressWarnings("unchecked")
			Map.Entry<String, String[]> entry = (Map.Entry<String, String[]>) it.next();

			String key = entry.getKey();
			String[] value = entry.getValue();

			System.out.println("Key is " + key);

			if (value.length > 1) {
				for (int i = 0; i < value.length; i++) {
					System.out.println(value[i].toString());
				}
			} else
				System.out.println("Value is " + value[0].toString());
			System.out.println("-------------------");
		}
	}

	private void guardarIngreso(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// System.out.println("ingreso");
		this.printParametersRequest(request);
		
		String concepto = request.getParameter("concepto");

		// default time zone
		ZoneId defaultZoneId = ZoneId.systemDefault();
		// creating the instance of LocalDate using the day, month, year info
		LocalDate localDate = LocalDate.of(2016, 8, 19);
		// local date + atStartOfDay() + default time zone + toInstant() = Date
		Date fecha = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());

		Double valor = Double.parseDouble(request.getParameter("valor"));
		int idCuenta = Integer.parseInt(request.getParameter("idCuenta"));
		int idCategoria = Integer.parseInt(request.getParameter("idCategoria"));

		Categoria cat = Categoria.getById(idCategoria);
		Cuenta cta = Cuenta.getById(idCuenta);

		Movimiento mov = new Movimiento();
		mov.setCategoria(cat);
		mov.setConcepto(concepto);
		mov.setDestino(cta);
		mov.setFecha(fecha);
		mov.setMonto(valor);
		mov.setOrigen(null);
		mov.setTipo(TipoMovimiento.INGRESO);
		
		System.out.println(mov);

		Movimiento.createIngreso(mov);

		// Llamo a la vista
		response.sendRedirect("DashboardController");
		

	}

	/**
	 * Default constructor
	 */
	public RegistrarMovimientosController() {
	}

}