<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Libros</title>
</head>
<body>
<h1>Lista de Libros</h1>
	<table>
		<tr>
			<td>ISBN</td>
			<td>Titulo</td>
			<td>Autor</td>
			<td>Acciones</td>
		</tr>
		
		<c:forEach items="${listaLibros}" var="libro" >
		<tr>
			<td>${libro.isbn}</td>
			<td>${libro.titulo}</td>
			<td>${libro.autor}</td>
			<td> <a href="ActualizarController?id=${libro.isbn}">Actualizar</a> | <a href="EliminarController?id=${libro.isbn}">Eliminar</a></td>
		</tr>
		</c:forEach>
		
		
		
	</table>

</body>
</html>