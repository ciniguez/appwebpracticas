<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Lista de Libros </h1>
<table class="table">
	<thead class="thead-dark">
		<tr>
			<th scope="col">ISBN</th>
			<th scope="col">titulo</th>
			<th scope="col">autor</th>
			<th scope="col">Acciones</th>
		</tr>
	</thead>

		<c:forEach var="persona" items="${libros}">
			<tr>
				<td scope="row">${persona.isbn}</td>
				<td>${persona.titulo}</td>
				<td>${persona.autor}</td>
				<td></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>