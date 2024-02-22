package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Carlos Iñiguez
 */
@WebServlet("/RegistrarMovimientosController")
public class RegistrarMovimientosController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}


	private void nuevaTransferencia(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void nuevoGasto(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void nuevoIngreso(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	private void eliminarGasto(HttpServletRequest request, HttpServletResponse response) {

	}

	private void eliminarIngreso(HttpServletRequest request, HttpServletResponse response) {

	}

	private void guardarTransferencia(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	private void guardarEgreso(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}



	private void guardarIngreso(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		

	}

	/**
	 * Default constructor
	 */
	public RegistrarMovimientosController() {
	}

}