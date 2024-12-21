<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

	<form method="POST" action="../login?ruta=login">
		<fieldset>
			
			<label for="txtUsername">Nombre de Usuario:</label><br> 
			<input type="text" name="username" id="txtUsername"><br> 
			
			<label for="txtClave">Clave:</label><br> 
			<input type="password" name="clave" id="txtClave"><br> 
			
			<input type="submit" value="Ingresar">

		</fieldset>
	</form>
</body>
</html>