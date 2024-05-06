package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Categoria;
import entities.Cuenta;
import entities.Movimiento;


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
		String ruta = (request.getParameter("ruta")!=null)? request.getParameter("ruta"):"ver";
		
		switch(ruta) {
		case "ver":
			verDashboard(request, response);
			break;
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
		
		// 1.- Obtengo datos
		
		//2.- Hablo con el modelo
		List<Cuenta> cuentas = Cuenta.getSumarized();
		List<Categoria> categorias = Categoria.getSumarizedByDate(0);
		List<Movimiento> movimientos = Movimiento.getAllByDate(new Date());
		
		
		/*Chanchullo para probar que funciona*/
		/*
		List<Cuenta> cuentas = new ArrayList();
		cuentas.add(new Cuenta("Pichincha", 1000));
		cuentas.add(new Cuenta("Efectivo", 10));
		*/
		
		//3.- Llamo a la vista
		request.setAttribute("cuentas", cuentas);
		request.setAttribute("movimientos", movimientos);
		request.setAttribute("categorias", categorias);
		request.getRequestDispatcher("/jsp/dashboard.jsp").forward(request, response);
	}

	/**
     * Default constructor
     */
    public DashboardController() {
    }

    

}