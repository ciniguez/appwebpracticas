package controlador.autorizar;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Persona;

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
		// AQUI TU CODIGO
		// 1.- Obtener parametros
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		// 2.- Llamar al Modelo
		
		Persona persona = new Persona();
		Persona personaAutorizada =  persona.autorizar(usuario, password);
		if(personaAutorizada != null) {
			HttpSession sesion = request.getSession();
			sesion.setAttribute("usuarioLogeado", personaAutorizada);
			// NAvegar al Controlador para Listar
			response.sendRedirect("GestionarPersonaController?ruta=listar");
		}else {
			request.setAttribute("mensaje", "Usuario o Password Incorrectos. Vuelva a Intentar.");
			request.setAttribute("path", "LoginController");
			this.error(request, response);
			
		}
		// 3.- Llamar a la vista

	}

	private void salir(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		request.getSession().invalidate();
		response.sendRedirect("jsp/login.jsp");
	}

	private void error(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("jsp/error.jsp").forward(request, response);
	}
}
