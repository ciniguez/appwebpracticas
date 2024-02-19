package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;

@WebServlet("/ActualizarController")
public class ActualizarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ActualizarController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Obtener parametros
		String isbn = request.getParameter("id");
		//2. Hablar con el Modelo
		Libro miLibro = Libro.getLibroByIsbn(isbn);
		//3. Llamar a la Vista
		request.setAttribute("libro", miLibro);
		request.getRequestDispatcher("actualizar.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Obtengo parametros
		String isbn = request.getParameter("isbn");
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		//2. Hablo con el Modelo
		Libro miLibro= new Libro(isbn, titulo,autor);
		Libro.update(miLibro);
		//3. Hablo con la Vista
		
		response.sendRedirect("BibliotecaController");
	}

}
