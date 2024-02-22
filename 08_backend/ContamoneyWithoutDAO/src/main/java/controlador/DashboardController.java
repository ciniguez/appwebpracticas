package controlador;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Categoria;
import entities.Cuenta;

/**
 * @author Carlos Iñiguez
 */
@WebServlet("/DashboardController")
public class DashboardController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ruteador(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ruteador(request, response);
	}

	private void ruteador(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ruta = (request.getParameter("ruta")!= null)? request.getParameter("ruta"): "ver";
		
		switch (ruta) {
		case "ver":
			verDashboard(request, response);
			break;
		case "cuenta":
			verCuenta(request, response);
			break;
		case "filtrar":
			filtrarPorMesContable(request, response);
			break;
		case "categoria":
			verCategoria(request, response);
			break;
		case "movimientos":
			verMovimientos(request, response);
			break;
			default:
				verDashboard(request, response);
			
		}
	
		
	}
	private void verMovimientos(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void verCategoria(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void filtrarPorMesContable(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void verCuenta(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void verDashboard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int mes, anio = 0;
		mes = (request.getParameter("mes")!= null)? Integer.parseInt(request.getParameter("mes")): LocalDate.now().getMonthValue();
		anio = LocalDate.now().getYear();
		
		//Aqui probar lo de tomar desde contabilidad
		List<Cuenta> cuentas = Cuenta.getSumarized();
		/****** Datos para prueba ***********/
		/*
		 * List<Cuenta> seed = new ArrayList(); seed.add(new Cuenta("Bco. Pichincha",
		 * 1000.0)); seed.add(new Cuenta("Bco. Holandes", 2000.0)); cuentas = seed;
		 */
		
		
		List<Categoria> categorias = Categoria.getSumarizedByDate(mes);
		
		request.setAttribute("cuentas", cuentas);
		request.setAttribute("categorias", categorias);
		request.getRequestDispatcher("/jsp/dashboard.jsp").forward(request, response);
		
	}

	/**
     * Default constructor
     */
    public DashboardController() {
    }

    

}