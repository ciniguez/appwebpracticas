package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Libro;

@WebServlet("/servlet")
public class MiServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Servlet INICIADO");

	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, res);
		System.out.println("Ingresa a SERVICE");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("SERVICE por: GET");

		List<Libro> lista = Libro.getLibros();

		req.setAttribute("libros", lista);
		req.getRequestDispatcher("listaLibros.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("SERVICE por: POST");

		String isbn = req.getParameter("isbn");
		Libro libroBuscado = Libro.getLibroByIsbn(isbn);

		/*
		req.setAttribute("libro", libroBuscado);
		req.getRequestDispatcher("listaLibros.jsp").forward(req, resp);
		*/
		
		PrintWriter salida = resp.getWriter();
		salida.print("<HTML>");
		salida.print("<head>");
		salida.print("</head>");
		salida.print("<body>");
		salida.print("El Libro buscado es: " + libroBuscado.getTitulo());
		salida.print("</body>");
		salida.print("</HTML>");
		

	}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Servlet desctruido");
	}

}
