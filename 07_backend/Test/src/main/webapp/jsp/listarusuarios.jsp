<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Personas</title>
<!--  ******** INICIO DISENIO UI **************** -->
<%@ include file="../templates/meta.jsp"%>
<!--  ******** FIN DISENIO UI **************** -->

</head>
<body>



	<!--  ******** INICIO DISENIO UI **************** -->
	<%@include file='../templates/banner_inside.html'%>
		<!--  ******** FIN DISENIO UI **************** -->




		<h1>Listado de Personas</h1>

		<!-- div>Bienvenido ${sessionScope.usuario.getNombre()}</div>
		<div>
			<a href="LogOutController">Salir</a>
		</div>
		 -->
		<div>
			<a href="GestionarCuentasController?ruta=listar">Ver Cuentas Bancarias</a>
		</div>
		<div>
			<a href="GestionarUsuariosController?ruta=nuevo">Nuevo</a>
		</div>

		<table class="table">
			<caption>Lista de Personas en la BDD</caption>
			<thead>
				<tr>
					<th scope="col">Código</th>
					<th scope="col">Nombre</th>
					<th scope="col">Contraseña</th>
					<th scope="col">Acciones</th>
				</tr>
			</thead>

			<c:forEach var="persona" items="${personas}">
				<tr>
					<td>${persona.id}</td>
					<td>${persona.nombre}</td>
					<td>${persona.clave}</td>
					<td><a
						href="GestionarUsuariosController?ruta=actualizar&idPersona=${persona.id}"> <box-icon
								name='refresh'></box-icon>Actualizar
					</a> | <a href="GestionarUsuariosController?ruta=eliminar&idPersona=${persona.id}"><box-icon
								name='trash' type='solid'></box-icon>Eliminar</a></td>
				</tr>
			</c:forEach>

		</table>


		<!--  ******** INICIO DISENIO UI **************** -->

	<%@ include file="../templates/footer.jsp"%>
	<!--  ******** FIN DISENIO UI **************** -->
</body>
</html>