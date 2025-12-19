package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Persona;

@WebServlet("/Cucquita")
public class MiServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Peticiòn por GET");
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Carlos", "17165342628", "Gonzales"));
		personas.add(new Persona("Pedro", "3453453453", "Escamoso"));
		personas.add(new Persona("Dady", "345345345", "Yaku"));
		personas.add(new Persona("Michael", "78956756", "Chiluisa"));
		
		
		// Comunicarse con la vista
		req.setAttribute("lista", personas);
		req.getRequestDispatcher("vista/mivista.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
