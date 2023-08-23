package controlador;



/**
 * @author crossover
 * @version 1.0
 * @created 16-ago-2023 20:21:20
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.dao.DAOFactory;
import modelo.entities.Persona;

@WebServlet("/AutenticacionController")
public class AutenticacionController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AutenticacionController() {

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
			this.iniciar(request, response);
			break;
		case "login":
			this.login(request, response);
			break;
		default:

			// this.inicio(request, response);

			break;

		}

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void salir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener par�metros (opcional)
		String username = request.getParameter("username");
		String clave = request.getParameter("clave");

		// 2.- Consultar la Modelo (Opcional)
		Persona autorizado = DAOFactory.getFactory().getPersonaDAO().autorizar(username, clave);
		// 3.- Llamar a la Vista
		if(autorizado != null) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("autorizado", autorizado);
			request.getRequestDispatcher("GestionarCuentas?ruta=listar");
		}else {
			response.sendRedirect("views/login.jsp");
		}

	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void iniciar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener par�metros (opcional)

		// 2.- Consultar la Modelo (Opcional)

		// 3.- Llamar a la Vista
		response.sendRedirect("views/login.jsp");

	}

}