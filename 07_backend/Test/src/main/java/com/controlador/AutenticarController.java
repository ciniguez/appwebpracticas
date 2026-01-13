package com.controlador;

import java.io.IOException;

import com.modelo.entidades.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import com.modelo.dao.DAOFactory;

/**
 * Servlet implementation class AutenticarController
 */
@WebServlet("/AutenticarController")
public class AutenticarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AutenticarController() {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.ruteador(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.ruteador(req, resp);
	}

	private void ruteador(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ruta = (req.getParameter("ruta") == null) ? "iniciar" : req.getParameter("ruta");

		switch (ruta) {
		case "ingresar":
			this.ingresar(req, resp);
			break;
		case "iniciar":
			this.iniciar(req, resp);
			break;
		case "salir":
			this.salir(req, resp);
			break;
		}
	}

	private void iniciar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 1.- Obtener los parámetros

		// 2.- Hablar con el modelo

		// 3.- Llamar a la vista
		resp.sendRedirect("jsp/login.jsp");
	}

	private void ingresar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.- Obtener los parámetros
		String usuario = req.getParameter("usuario");
		String clave = req.getParameter("clave");

		// 2.- Hablar con el modelo

		Usuario resultado = DAOFactory.getFactory().getPersonaDAO().authenticate(usuario, clave);
		System.out.println(resultado);

		// 3.- Llamar a la vista
		if (resultado == null) {
			// no le permito pasar y lo regreso al login
			resp.sendRedirect("jsp/login.jsp");
		} else {
			HttpSession sesionSitio = req.getSession();
			sesionSitio.setAttribute("autorizado", resultado);

			// le prmito pasar (Listar usuarios)
			resp.sendRedirect("GestionarUsuariosController?ruta=listar");
		}
	}

	private void salir(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		sesion.invalidate();
		response.sendRedirect("jsp/login.jsp");
	}

}
