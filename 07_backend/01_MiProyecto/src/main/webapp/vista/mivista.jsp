<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Lista de Personas</h1>
	<table>
		<thead>
			<tr>
				<td>Cédula</td>
				<td>Nombrar</td>
				<td>Apellido</td>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${lista}" var="personita">
				<tr>
					<td>${personita.cedula}</td>
					<td>${personita.nombre}</td>
					<td>${personita.apellido}</td>
				</tr>
			</c:forEach>


		</tbody>
	</table>
</body>
</html>