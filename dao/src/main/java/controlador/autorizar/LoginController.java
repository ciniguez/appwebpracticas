package controlador.autorizar;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.JDBCImpl.JDBCPersonaDAO;
import modelo.dao.PersonaDAO;
import modelo.entities.Persona;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.rutear(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.rutear(req, resp);
	}

	private void rutear(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String ruta = (request.getParameter("ruta") == null) ? "inicio" : request.getParameter("ruta");

		switch (ruta) {
		case "inicio":
			this.inicio(request, response);
			break;
		case "ingresar":
			this.ingresar(request, response);
			break;
		case "salir":
			this.salir(request, response);
			break;
		case "error":
			this.error(request, response);
			break;
		default:
			this.inicio(request, response);
			break;
		}
	}

	private void inicio(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.sendRedirect("jsp/login.jsp");
	}

	private void ingresar(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// 1.- Obtengo los parámetros
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");

		// 2.- Verifico que las idenficiaciones corresponden con una persona de mi
		// modelo
		Persona persona = new Persona();

		Persona personaAutorizada;

		//personaAutorizada = persona.autorizar(usuario, password);
		PersonaDAO modeloDAO = new JDBCPersonaDAO();
		personaAutorizada = modeloDAO.autorizar(usuario, password);

		if (personaAutorizada != null) {
			// Creación de la sesion
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuarioLogeado", personaAutorizada);

			// Navego hacia el JSP pero siempre llamando al controlador
			response.sendRedirect("GestionarPersonaController?ruta=listar");

		} else {
			request.setAttribute("mensaje", "Usuario o Password Incorrecto");
			request.setAttribute("path", "LoginController");
			this.error(request, response);
		}
	}

	private void salir(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getSession().invalidate();
		response.sendRedirect("jsp/login.jsp");
	}

	private void error(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/error.jsp").forward(request, response);
	}
}
