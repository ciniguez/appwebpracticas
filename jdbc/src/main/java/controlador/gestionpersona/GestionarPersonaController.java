package controlador.gestionpersona;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.Persona;

@WebServlet("/GestionarPersonaController")
public class GestionarPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GestionarPersonaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("usuarioLogeado") == null) {
			System.out.println("Seguridad");
			response.sendRedirect("jsp/login.jsp");
		} else {
			this.rutear(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.rutear(request, response);
	}

	private void rutear(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ruta = (request.getParameter("ruta") == null) ? "listar" : request.getParameter("ruta");

		switch (ruta) {
		case "listar":
			this.listar(request, response);
			break;
		case "nuevo":
			this.nuevo(request, response);
			break;
		case "guardar":
			this.guardar(request, response);
			break;
		case "actualizar":
			this.actualizar(request, response);
			break;
		case "eliminar":
			this.eliminar(request, response);
			break;
		default:
			this.listar(request, response);
			break;
		}

	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Persona persona = new Persona();
		List<Persona> personas = persona.getPersonas();

		request.setAttribute("personas", personas);
		getServletContext().getRequestDispatcher("/jsp/listarPersonas.jsp").forward(request, response);
	}

	private void nuevo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/jsp/insertarPersona.jsp").forward(request, response);
	}

	private void guardar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.- Obtengo parámetros
		int id = (request.getParameter("txtId") == "") ? 0 : Integer.parseInt(request.getParameter("txtId"));
		String nombre = request.getParameter("txtNombre");
		String clave = request.getParameter("txtClave");

		Persona persona = new Persona(id, nombre, clave);

		// 2.- Hablar con el Modelo

		if (persona.getPersonaById(id) == null) {
			persona.create();
		} else {
			persona.update(nombre, clave);
		}

		// 3.- Navego a la vista
		response.sendRedirect("GestionarPersonaController?ruta=listar");
	}

	private void actualizar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idPersona = Integer.parseInt(request.getParameter("idPersona"));

		Persona persona = new Persona();
		persona = persona.getPersonaById(idPersona);

		request.setAttribute("persona", persona);
		String url = "/jsp/actualizarPersona.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	private void eliminar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("idPersona");

		Persona persona = new Persona();
		persona = persona.getPersonaById(Integer.parseInt(id));

		try {
			persona.delete();
			response.sendRedirect("GestionarPersonaController?ruta=listar");

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			request.setAttribute("path", "GestionarPersonaController?ruta=listar");
			request.getRequestDispatcher("LoginController?ruta=error").forward(request, response);
		}
	}

}
