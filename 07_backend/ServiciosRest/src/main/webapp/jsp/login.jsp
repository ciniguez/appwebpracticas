<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>


<!--  ******** INICIO DISENIO UI **************** -->
<%@ include file="../templates/meta.jsp"%>
<!--  ******** FIN DISENIO UI **************** -->

</head>
<body>


	<!--  ******** INICIO DISENIO UI **************** -->
	<%@include file='../templates/banner.html'%>
	<div class="wrapper">
		<div id="formContent">
			<!--  ******** FIN DISENIO UI **************** -->




			<form action="../AutenticarController?ruta=ingresar" method="POST">
				<fieldset>
					<legend>Ingreso de Sistema</legend>

					<p>Usuario:</p>
					<input type="text" name="usuario" />

					<p>Clave</p>
					<input type="password" name="clave" /> <br> <br> <br>
					<input type="submit" value="Ingresar" /> <br> <br>

				</fieldset>
			</form>

			<!--  ******** INICIO DISENIO UI **************** -->
		</div>
		<%@ include file="../templates/footer.jsp"%>
		<!--  ******** FIN DISENIO UI **************** -->
	</div>



</body>
</html>