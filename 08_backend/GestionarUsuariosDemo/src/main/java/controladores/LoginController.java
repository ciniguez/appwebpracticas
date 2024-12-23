package controladores;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.ruteador(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.ruteador(request, response);
	}

	private void ruteador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Logica del control
		String ruta = (request.getParameter("ruta") == null) ? "ingresar" : request.getParameter("ruta");

		switch (ruta) {
		case "ingresar":
			this.ingresar(request, response);
			break;
		case "login":
			this.login(request, response);
			break;
		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtener parametros
		String usuario = request.getParameter("username");
		String clave = request.getParameter("clave");

		// 2.- Hablar con el modelo
		Usuario u;
		try {
			u = Usuario.autenticarPersona(usuario, clave);
			if (u != null) {
				// Le premito ir al CU GestionarUsuarios (listar Usuarios)
				// 3.- redireccionar a la Vista/Controlador
				response.sendRedirect("GestionarUsuariosController?ruta=listar");
			} else {
				// 3.- redireccionar a la Vista
				response.sendRedirect("jsp/login.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void ingresar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1.- Obtener parametros
		// 2.- Hablar con el modelo
		// 3.- redireccionar a la Vista
		response.sendRedirect("jsp/login.jsp");
	}
}
