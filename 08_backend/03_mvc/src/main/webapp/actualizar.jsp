<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actualizar Libro</title>
</head>
<body>

<h1>Actualizar Libro</h1>
<form method="POST" action ="ActualizarController">
	<label>ISBN</label><br>
	<input type="text" value="${libro.isbn}" name="isbn"><br>
	<label>Titulo</label><br>
	<input type="text" value="${libro.titulo}" name="titulo"><br>
	<label>Autor</label><br>
	<input type="text" value="${libro.autor}" name="autor"><br>
	
	<input type="submit" value="Guardar"/>
</form>

</body>
</html>