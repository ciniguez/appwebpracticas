package controladores;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;

@WebServlet("/GestionarUsuariosController")
public class GestionarUsuariosController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.ruteador(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.ruteador(request, response);
	}

	private void ruteador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Logica del control
		String ruta = (request.getParameter("ruta") == null) ? "listar" : request.getParameter("ruta");

		switch (ruta) {
		case "listar":
			this.listar(request, response);
			break;
		case "guardar":
			this.guardar(request, response);
			break;
		case "insertar":
			this.insertar(request, response);
			break;
		}

	}

	private void insertar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void guardar(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.- Obtiene parámetros (OPCIONAL)

		// 2.- Hablo con el Dominio (OPCIONAL)
		List<Usuario> usuarios;
		try {
			usuarios = Usuario.getUsuarios();

			// 3.- HAblo con la Vista
			request.setAttribute("usuarios", usuarios);
			getServletContext().getRequestDispatcher("/jsp/listarUsuarios.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Entro a listar");

	}

}
