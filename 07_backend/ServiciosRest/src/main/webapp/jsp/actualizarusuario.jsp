<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!--  ******** INICIO DISENIO UI **************** -->
<%@ include file="../templates/meta.jsp" %>
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
			<a href="GestionarUsuariosController?ruta=listar">Sistema/Listar Personas</a>
		</div>

		
		
		<h1>Actualizar Persona</h1>
		<form method="POST" action="ActualizarPersonaController">
			<input type="hidden" value="${persona.id}" name="txtIdPersona" /> 
			
			<label for="txtNombre">Nombre</label> <br>
			<input type="text" name="txtNombre" id="txtNombre" value="${persona.nombre}" /> <br>
			<label for="txtClave">Clave</label><br>
			<input type="password" name="txtClave"  id="txtClave" value="${persona.clave}" /> 
			
			<br><br>
			<input type="submit" value="Guardar">
			<input type="button" value="Cancelar">
		</form>

		
			<!--  ******** INICIO DISENIO UI **************** -->
		<%@ include file="../templates/footer.jsp"%>
		<!--  ******** FIN DISENIO UI **************** -->


</body>
</html>