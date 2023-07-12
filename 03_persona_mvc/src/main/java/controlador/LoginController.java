package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Persona;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.- Obtener datos que me envían en la solicitud
		
		//2.- Llamo al Modelo para obtener datos
		
		//3.- Llamo a la Vista
		response.sendRedirect("jsp/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.- Obtener datos que me envían en la solicitud
		
		String nombre = request.getParameter("usuario");
		String clave = request.getParameter("password");
		
		//2.- Llamo al Modelo para obtener datos
		
		Persona modeloPersona = new Persona();
		Persona personaAutenticada =  modeloPersona.autorizar(nombre, clave);
		if(personaAutenticada != null) {
			
			//Crear la sesion
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogeado", personaAutenticada);
			
			//3.- Llamo a la Vista
			response.sendRedirect("ListarPersonaController");
			//request.getRequestDispatcher("ListarPersonaController").forward(request, response);
			return;
			
		}else {
			
			//3.- Llamo a la Vista
			
			String mensaje = "Ingresaste mal tu usuario y clave";
			//Enviar datos a la vista
			request.setAttribute("mensaje", mensaje);
			//Redireccionar a la vista
			request.getRequestDispatcher("jsp/error.jsp").forward(request, response);
		}
				
		
	}

}
