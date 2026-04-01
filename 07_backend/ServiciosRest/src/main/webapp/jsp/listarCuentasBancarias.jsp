<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Cuentas Bancarias</title>
<!--  ******** INICIO DISENIO UI **************** -->
<%@ include file="../templates/meta.jsp"%>
<!--  ******** FIN DISENIO UI **************** -->
</head>
<body>


	<!--  ******** INICIO DISENIO UI **************** -->
	<%@include file='../templates/banner_inside.html'%>

		<!--  ******** FIN DISENIO UI **************** -->


		<h1>Cuentas Bancarias</h1>
		<!-- 
		<div>Bienvenido ${sessionScope.usuario.getNombre()}</div>
		<div>
			<a href="LogOutController">Salir</a>
		</div>
		 -->
		<div>
			<a href="GestionarUsuariosController?ruta=listar">Sistema/Listar Personas</a>
		</div>
		<div>
			<a href="GestionarCuentasController?ruta=nuevo">Nueva Cuenta</a>
		</div>

		<table class="table">
		<thead class="thead-dark">
			<tr>
				<th scope="col">Numero Cuenta</th>
				<th scope="col">Banco</th>
				<th scope="col">Propietario</th>
			</tr>
		<thead>
		<tbody>
			<c:forEach items="${cuentas}" var="cuenta">
				<tr>
					<td>${cuenta.numero}</td>
					<td>${cuenta.banco.nombreBanco}</td>
					<td>${cuenta.propietario.nombre}</td>
				</tr>
			</c:forEach>
		</tbody>

		</table>


		<!--  ******** INICIO DISENIO UI **************** -->
	<%@ include file="../templates/footer.jsp"%>
	<!--  ******** FIN DISENIO UI **************** -->
</body>

</html>