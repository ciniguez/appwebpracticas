<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ingreso</title>
    <link rel="stylesheet" href="css/styleMovimientos.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>

</head>

<body>
    <!-- nav -->
     <header class="header_pagina_principal">
        <button class="boton boton2 usuario_shortcut">
            <img src="https://picsum.photos/30" alt="imagen de usuario">
            <p>Usuario</p>
        </button>
        <div>
            <a href="">
                <iconify-icon class="icono" icon="carbon:view-filled" width="18"></iconify-icon>
                <span>Dashboard</span>
            </a>
            <a href="">
                <iconify-icon class="icono" icon="carbon:view-filled" width="18"></iconify-icon>
                <span>Configuración</span>
            </a>
        </div>
    </header>
    
    <main class="main_pagina_principal">
        <div class="contenedor_default dash_head">
            <header class="header_contenedor">
                <h3>${cuenta.nombre}</h3>
                <button class="boton boton2 color_inactivo_boton">
                    <iconify-icon class="icono" icon="carbon:view-filled" width="18"></iconify-icon>
                </button>
            </header>
            <main class="balance">
                <iconify-icon class="icono" icon="cryptocurrency:usd" style="color: white;" width="32"></iconify-icon>
                <h1>${cuenta.total}</h1>
            </main>
        </div>

        <div class="contenedor_form">
            <form action="RegistrarMovimientosController?ruta=guardaringreso" method="post">
            	
            	<!-- input type="hidden" value="${cuenta.id}" name="idCuenta"/-->
            
                <label for="ingreso">Valor a ingresar</label>
                <input id="ingreso" type="number" min="0" name="valor">
                
                <label for="categoria">Categoría</label>
                <select id="tipo" class="select-categoria" name="idCategoria">
	                <c:forEach items="${categorias}" var="categoria">
	                    <option value="${categoria.id}">${categoria.nombre}</option>
	                </c:forEach>
                </select>
                
                <label for="fecha">Selecciona una fecha:</label>
                <input type="date" id="fecha" name="fecha">
                
                <label for="">Concepto</label>
                <input type="text" placeholder="Ingrese motivo de ingreso" name="concepto" value=""/>
                
                <div class="btn-confirmacion">
                    <input type="submit" class="boton boton1" value="Depositar">
                </div>
            </form>
        </div>
    </main>

</body>

</html>