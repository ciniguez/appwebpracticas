<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
	crossorigin="anonymous">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" />
</head>
<body>
	<%@include file='../templates/banner_inside.html'%>
	
	<h1>Listado de Personas</h1>
	
	<div><a href="GestionarPersonaController?ruta=nuevo">Nuevo</a></div>
	
	
    
	<table class="table">
	
	<thead class="thead-dark">
		<tr>
			<th scope="col">Id</th>
			<th scope="col">Nombre</th>
			<th scope="col">Contraseña</th>
			<th scope="col">Acciones</th>
		</tr>
	</thead>

		<c:forEach var="persona" items="${personas}">
			<tr>
				<td scope="row">${persona.id}</td>
				<td>${persona.nombre}</td>
				<td>${persona.password }</td>
				<td>
					<a href="GestionarPersonaController?ruta=actualizar&idPersona=${persona.id}">Actualizar</a> | 
					<a href="GestionarPersonaController?ruta=eliminar&idPersona=${persona.id}"">Eliminar</a>
				</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>