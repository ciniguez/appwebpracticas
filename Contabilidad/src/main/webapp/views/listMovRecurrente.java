/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:15
 */
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<!-- CSS only -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/estilos.css">
<body> <div>
<h1>Consulta de listMovRecurrente</h1>
<button><a href="NameController?ruta=nuevo"> Nuevo </a></button>
<table class="table">
  <thead class="thead-dark">
    <tr>
	<th scope="col">fechaInicio</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
	<c:forEach var="item" items="${listMovRecurrentes}">
	  <tr>
        	<td scope="row">${item.fechaInicio}</td>
		<td><a href="NameController?ruta=ver&id=${listMovRecurrente.id}">Update</a> | <a href="NameController?ruta=delete&id=${listMovRecurrente.id}">Delete</a></td>
	  </tr>
	</c:forEach>
	</tbody>
</table>
</div>
</body>
</html>