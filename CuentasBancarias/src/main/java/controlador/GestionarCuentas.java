package controlador;

/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DAOFactory;
import modelo.entities.Cuenta;

@WebServlet("/GestionarCuentas")
public class GestionarCuentas extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public GestionarCuentas() {

		super();
	}

	@Override

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		this.ruteador(request, response);

	}

	@Override

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		this.ruteador(request, response);

	}

	private void ruteador(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String ruta = (request.getParameter("ruta") == null) ? "inicio" : request.getParameter("ruta");

		// Se ha creado un primer case como muestra.

		switch (ruta) {

		case "inicio":
			// Aqu� el m�todo al que se llamar�, seg�n la ruta obtenida.
			// this.inicio(request, response);
			break;
		case "listar":
			this.listar(request, response);
			break;

		default:
			this.listar(request, response);
			break;

		}

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void eliminar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.- Obtener par�metros (opcional)

		// 2.- Consultar la Modelo (Opcional)

		// 3.- Llamar a la Vista

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void guardar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener par�metros (opcional)

		// 2.- Consultar la Modelo (Opcional)

		// 3.- Llamar a la Vista

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void actualizar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.- Obtener par�metros (opcional)

		// 2.- Consultar la Modelo (Opcional)

		// 3.- Llamar a la Vista

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener par�metros (opcional)

		// 2.- Consultar la Modelo (Opcional)

		// 3.- Llamar a la Vista

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener par�metros (opcional)
		// 2.- Consultar la Modelo (Opcional)
		List<Cuenta> listCuentas = DAOFactory.getFactory().getCuentaDAO().getAll();
		// 3.- Llamar a la Vista
		request.setAttribute("cuentas", listCuentas);
		request.getRequestDispatcher("views/listCuenta.jsp");

	}

}