package com.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonaController")
public class PersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Ingresó por GET");
		String nombre = req.getParameter("nombre");

		System.out.println(nombre);

		if (nombre.equals("Carlos")) {
			// responder.jsp
			req.setAttribute("dato", nombre);
			req.getServletContext().getRequestDispatcher("/jsp/responder.jsp").forward(req, resp);
		} else {
			// error.jsp
		
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Ingresó por POST");

		String nombre = req.getParameter("nombre");

		System.out.println(nombre);

		if (nombre.equals("Carlos")) {
			
			
		} else {
			
		}
	}

}
