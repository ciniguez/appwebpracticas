package com.controlador;

import java.util.*;

import javax.persistence.*;

/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:14
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AutenticacionController")
public class AutenticacionController extends HttpServlet {
private static final long serialVersionUID = 1L;
	public AutenticacionController(){

	 super();}
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	this.ruteador(request, response);
}
@Override
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	this.ruteador(request, response);
}
private void ruteador(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	String ruta = (request.getParameter("ruta") == null)?"inicio":request.getParameter("ruta");
	
	//Se ha creado un primer case como muestra.
	switch (ruta) {
	case "inicio":
		//Aqu� el m�todo al que se llamar�, seg�n la ruta obtenida.
		//this.inicio(request, response);
		break;
	default:
		//this.inicio(request, response);
		break;
	}
}
	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void salir(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException,IOException{
	//1.- Obtener par�metros (opcional)

	//2.- Consultar la Modelo (Opcional)

	//3.- Llamar a la Vista


	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void login(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException,IOException{
	//1.- Obtener par�metros (opcional)

	//2.- Consultar la Modelo (Opcional)

	//3.- Llamar a la Vista


	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @exception ServletException,IOException
	 */
	public void iniciar(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException,IOException{
	//1.- Obtener par�metros (opcional)

	//2.- Consultar la Modelo (Opcional)

	//3.- Llamar a la Vista


	}
}