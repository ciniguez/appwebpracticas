<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insertar Persona</title>

<!--  ******** INICIO DISENIO UI **************** -->
<%@ include file="../templates/meta.jsp"%>
<!--  ******** FIN DISENIO UI **************** -->

</head>
<body>

	<!--  ******** INICIO DISENIO UI **************** -->
	<%@include file='../templates/banner_inside.html'%>

		<!--  ******** FIN DISENIO UI **************** -->

		<!-- 
		<div>Bienvenido ${sessionScope.usuario.getNombre()}</div>
		<div>
			<a href="LogOutController">Salir</a>
		</div>
		 -->
		 
		 <div>
			<a href="../GestionarUsuariosController?ruta=listar">Sistema/Listar Personas</a>
		</div>
		
		<h1>Insertar Persona</h1>
		<form method="POST" action="../GestionarUsuariosController?ruta=guardarnuevo">
			<label for="txtNombre">Nombre</label><br> <input type="text"
				name="txtNombre" id="txtNombre" /> <br> <label for="txtClave">Clave</label><br>
			<input type="password" name="txtClave" id="txtClave" /> <br> <br>
			<input type="submit" value="insertar">

		</form>


		<!--  ******** INICIO DISENIO UI **************** -->

	<%@ include file="../templates/footer.jsp"%>
	<!--  ******** FIN DISENIO UI **************** -->


</body>
</html>