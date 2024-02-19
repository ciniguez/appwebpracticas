package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;


@WebServlet("/EliminarController")
public class EliminarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EliminarController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Obtener parametros
		String isbn= request.getParameter("id");
		//2. Llamo al Modelo
		Libro.deleteById(isbn);
		//3. Llamo a la Vista
		response.sendRedirect("BibliotecaController");
		//request.getRequestDispatcher("BibliotecaController").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
