package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;


@WebServlet("/BibliotecaController")
public class BibliotecaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BibliotecaController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.- Obtener parametros
		//2.- Llamar al Modelo
		List<Libro> lista = Libro.getLibros();
		//3.- LLamar a la Vista
		request.setAttribute("listaLibros",lista);
		request.getRequestDispatcher("listaLibros.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
