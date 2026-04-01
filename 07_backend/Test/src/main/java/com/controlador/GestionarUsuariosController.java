package com.controlador;

import java.io.IOException;
import java.util.List;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Usuario;
import com.modelo.jpa.JPAUsuarioDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class GestionarUsuarioController
 */
@WebServlet("/GestionarUsuariosController")
public class GestionarUsuariosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public GestionarUsuariosController() {
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
		String ruta = (req.getParameter("ruta") == null )? "listar": req.getParameter("ruta");
		

		switch (ruta) {
		case "listar":
			this.listar(req, resp);
			break;
		case "nuevo":
			this.nuevo(req, resp);
			break;
		case "actualizar":
			this.actualizar(req, resp);
			break;
		case "guardarnuevo":
			this.guardarNuevo(req, resp);
			break;
		case "guardarexistente":
			this.guardarExistente(req, resp);
			break;
		case "eliminar":
			this.eliminar(req, resp);
			break;
		default:
			this.listar(req, resp);
			break;
		}
	}
	
	private void listar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.- Obtener los parámetros
		
		// 2.- Hablar con el modelo
		
		List<Usuario> personas =  DAOFactory.getFactory().getPersonaDAO().get();
		// 3.- Llamar a la vista
		req.setAttribute("personas", personas);
		req.getRequestDispatcher("jsp/listarusuarios.jsp").forward(req, resp);
	}

	private void nuevo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.- Obtener los parámetros
		// 2.- Hablar con el modelo
		// 3.- Llamar a la vista
		resp.sendRedirect("jsp/crearusuario.jsp");
	}

	private void guardarNuevo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		// 1.- Obtener los parámetros
		String nombre = req.getParameter("txtNombre");
		String clave = req.getParameter("txtClave");
		
		Usuario usuario = new Usuario(0, nombre, clave, false);
		// 2.- Hablar con el modelo
		
		DAOFactory.getFactory().getPersonaDAO().create(usuario);
		
		// 3.- Llamar a la vista
		
			resp.sendRedirect("GestionarUsuariosController?ruta=listar");
		
	}

	private void actualizar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 1.- Obtener los parámetros
		int idPersona = Integer.parseInt( req.getParameter("idpersona") );
		// 2.- Hablar con el modelo
		
		Usuario persona = DAOFactory.getFactory().getPersonaDAO().getById(idPersona);
		
		// 3.- Llamar a la vista
		req.setAttribute("persona", persona);
		req.getRequestDispatcher("jsp/actualizarusuario.jsp").forward(req, resp);
	}

	private void guardarExistente(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 1.- Obtener los parámetros
		int id = Integer.parseInt( req.getParameter("txtId"));
		String nombre = req.getParameter("txtNombre");
		String clave = req.getParameter("txtClave");
		
		Usuario usuario = new Usuario(id, nombre, clave, false);
		
		
		// 2.- Hablar con el modelo
		
		DAOFactory.getFactory().getPersonaDAO().update(usuario);
		
		// 3.- Llamar a la vista
		
			resp.sendRedirect("GestionarUsuariosController?ruta=listar");
		

	}

	private void eliminar(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		// 1.- Obtener los parámetros
		int idPersona = Integer.parseInt(req.getParameter("idpersona"));
		
		try {			
			// 2.- Hablar con el modelo
			UsuarioDAO usuarioDAO = new UsuarioDAO();
			usuarioDAO.delete(idPersona);
			// 3.- Llamar a la vista
			resp.sendRedirect("GestionarUsuariosController?ruta=listar");
		}catch(Exception ex) {
			req.setAttribute("mensaje", ex.getMessage());
			req.getRequestDispatcher("jsp/error.jsp").forward(req, resp);
		}*/
		int idPersona = Integer.parseInt(req.getParameter("idPersona"));
		JPAUsuarioDAO personaDAO = new JPAUsuarioDAO();
		personaDAO.deleteByID(idPersona);

		req.getRequestDispatcher("listarPersonasController").forward(req, resp);
	}
}
