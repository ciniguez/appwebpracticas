<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ingresar Cuenta Bancaria</title>
<%@include file="../templates/meta.jsp"%>
</head>
<body>

	<%@include file="../templates/banner_inside.html"%>

	<form action="GestionarCuentasController?ruta=guardar" method="POST">

		<label for="txtCuenta">Cuenta</label><br> 
		<input type="text" maxlength="8" id="txtCuenta" name="txtCuenta"><br> 
		
		<label for="cmbBanco">Banco</label><br>
		<select name="cmbBanco">
			<c:forEach items="${bancos}" var="banco">
				<c:choose>
					<c:when test="${banco.id == selectedBanco}">
						<option value="${banco.id}" selected>${banco.nombreBanco}</option>
					</c:when>
					<c:otherwise>
						<option value="${banco.id}">${banco.nombreBanco}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select> 
		<br>
		
		<label for="cmbPropietario">Propietario</label><br>
		<select
			name="cmbPropietario">
			<c:forEach items="${propietarios}" var="propietario">
				<c:choose>
					<c:when test="${propietario.id == selectedPropietario}">
						<option value="${propietario.id}" selected>${propietario.nombre}</option>
					</c:when>
					<c:otherwise>
						<option value="${propietario.id}">${propietario.nombre}</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select><br> 
		<input type="submit" value="Guardar" />
	</form>

	<%@include file="../templates/footer.jsp"%>
</body>
</html>