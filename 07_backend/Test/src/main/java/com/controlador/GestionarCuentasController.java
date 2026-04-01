package com.controlador;

import java.io.IOException;
import java.util.List;

import com.modelo.dao.DAOFactory;
import com.modelo.entidades.Banco;
import com.modelo.entidades.CuentaBancaria;
import com.modelo.entidades.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GestionarCuentasController
 */
@WebServlet("/GestionarCuentasController")
public class GestionarCuentasController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public GestionarCuentasController() {
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ruteador(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ruteador(request, response);
	}

	private void ruteador(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ruta = (req.getParameter("ruta") == null) ? "listar" : req.getParameter("ruta");

		switch (ruta) {
		case "listar":
			this.listarCuentas(req, resp);
			break;
		case "nuevo":
			this.nuevaCuenta(req, resp);
			break;
		case "guardar":
			this.guardarCuenta(req, resp);
			break;
		default:
			this.listarCuentas(req, resp);
		}
	}

	private void nuevaCuenta(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Usuario> propietarios = DAOFactory.getFactory().getPersonaDAO().get();
		List<Banco> bancos = DAOFactory.getFactory().getBancoDAO().get();
		/*
		 * Map<Persona,Boolean> mapaPersonas = new HashMap<Persona, Boolean>(); for
		 * (Persona p: propietarios) { if(p.getId()==1) { mapaPersonas.put(p, true); }
		 * mapaPersonas.put(p, false); }
		 */
		request.setAttribute("propietarios", propietarios);
		request.setAttribute("selectedPropietario", propietarios.get(0).getId());

		request.setAttribute("bancos", bancos);
		request.setAttribute("selectedBanco", bancos.get(0).getId());

		String url = "/jsp/insertarCuenta.jsp";
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	private void guardarCuenta(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String numeroCuenta = request.getParameter("txtCuenta");
		int idBanco = Integer.parseInt(request.getParameter("cmbBanco"));
		int idPersona = Integer.parseInt(request.getParameter("cmbPropietario"));

		// Obtengo el Banco
		Banco banco = DAOFactory.getFactory().getBancoDAO().getById(idBanco);
		// Obtengo la Persona
		Usuario persona = DAOFactory.getFactory().getPersonaDAO().getById(idPersona);

		CuentaBancaria cta = new CuentaBancaria(numeroCuenta, banco, persona);
		DAOFactory.getFactory().getCuentaBancariaDAO().create(cta);

		// Navego al Servlet Listar Cuentas Bancarias
		String url = "GestionarCuentasController?ruta=listar";
		response.sendRedirect(url);
	}

	private void listarCuentas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<CuentaBancaria> cuentas = DAOFactory.getFactory().getCuentaBancariaDAO().listarCuentas();
		request.setAttribute("cuentas", cuentas);
		getServletContext().getRequestDispatcher("/jsp/listarCuentasBancarias.jsp").forward(request, response);
	}

}
