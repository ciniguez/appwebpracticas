/**
 * @author crossover
 * @version 1.0
 * @created 21-ago-2023 13:24:16
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
<h1>Insertar Movimiento</h1>
	<form method="POST" action="NameController?ruta=some_ruta">
	<div class="form-group">
	<c:if test="${cuenta.id != 0 }">
		<label for="Idid">id</label>
	</c:if>
	<input type="${Movimiento.id!=0? 'text' : 'hidden'}" name="id" value="${Movimiento.id}" id="Idid" class="form-control" placeholder="text here"/> 
	</div>


	<div class="form-group">
	<label for="Idconcepto">concepto</label>
	<input type="text" name="concepto" value="${Movimiento.concepto}" id="Idconcepto" class="form-control" placeholder="text here"/> 
	</div>


	<div class="form-group">
	<label for="Idvalor">valor</label>
	<input type="text" name="valor" value="${Movimiento.valor}" id="Idvalor" class="form-control" placeholder="text here"/> 
	</div>


	<div class="form-group">
	<label for="Idfecha">fecha</label>
	<input type="text" name="fecha" value="${Movimiento.fecha}" id="Idfecha" class="form-control" placeholder="text here"/> 
	</div>


		<input type="submit" value="Enviar"><br>
		<input type="button" value="Cancelar">
	</form>
</div>
</body>
</html>