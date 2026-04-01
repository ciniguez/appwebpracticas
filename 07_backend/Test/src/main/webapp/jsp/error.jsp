<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error - Gestionar Usuarios</title>
</head>
<body>

	<div>
		<h1>Algo fue mal!!</h1>
		
		<p>${mensaje}</p>
		
		<br> <br> 
		<a href="GestionarUsuariosController?ruta=listar">Regresar a Lista de Usuarios</a>
	</div>
</body>
</html>