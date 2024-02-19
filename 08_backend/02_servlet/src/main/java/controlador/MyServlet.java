package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class MyServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Servlet INICIADO");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		this.procesar(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		this.procesar(req, resp);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("Servelt destruido");
	}

	public void procesar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("SERVEICe: por POST");

		String nombre = req.getParameter("txtNombre");
		System.out.println(nombre);

		PrintWriter salida = resp.getWriter();
		salida.print("<html>");
		salida.print("<head>");
		salida.print("</head>");
		salida.print("<body>");
		salida.print("<h1>(POST) El nombre es: " + nombre + "</h1>");
		salida.print("</body>");
		salida.print("</html>");

		salida.close();

	}

}
