package controladores;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Persona;

@WebServlet("/hola")
public class MiServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entró al GET de MiServlet");
		
		Persona p = new Persona();
		p.setNombre("Carlos");
		
		String respuesta = p.saludar();
		System.out.println(respuesta);
		
		// comunicacion con la JSP
		
		response.sendRedirect("jsp/saludo.jsp");
		/*
		request.setAttribute("usuario", p);
		request.getServletContext().getRequestDispatcher("/jsp/saludo.jsp").forward(request, response);
		*/
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	

}
