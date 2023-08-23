
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<body>
	<div>
		<h1>Pagina de login</h1>
		<div>

			<form method="POST" action="../AutenticacionController?ruta=login">
				<div class="form-group">
					<label for="Idusername">username</label> <input type="text"
						name="username" value="${login.username}" id="Idusername"
						class="form-control" placeholder="text here" />
				</div>
				<div class="form-group">
					<label for="Idclave">clave</label> <input type="text" name="clave"
						value="${login.clave}" id="Idclave" class="form-control"
						placeholder="text here" />
				</div>
				<div class="form-group">
					<input type="submit" value="Ingresar"/>
				</div>
				
			</form>
		</div>
	</div>
</body>
</html>