<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Mi Chauchera</title>
<link rel="stylesheet" href="./css/style.css">
<script
	src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>

</head>

<body>
	<!-- nav -->

	<header class="header_pagina_principal">
		<button class="boton boton2 usuario_shortcut">
			<img src="https://picsum.photos/30" alt="imagen de usuario">
			<p>Usuario</p>
		</button>
		<div>
			<a href=""> <iconify-icon class="icono" icon="carbon:view-filled"
					width="18"></iconify-icon> <span>Dashboard</span>
			</a> <a href=""> <iconify-icon class="icono"
					icon="carbon:view-filled" width="18"></iconify-icon> <span>Configuración</span>
			</a>
		</div>
	</header>

	<!-- dashboard de cartera digital -->
	<main class="main_pagina_principal">
		<div class="contenedor_default dash_head">
			<header class="header_contenedor">
				<h3>Balance Total</h3>
				<button class="boton boton2 color_inactivo_boton">
					<iconify-icon class="icono" icon="carbon:view-filled" width="18"></iconify-icon>
				</button>
			</header>

			<main class="balance">
				<iconify-icon class="icono" icon="cryptocurrency:usd"
					style="color: white;" width="32"></iconify-icon>
				<h1>3000.00</h1>
			</main>



		</div>

		<div class="contenedor-resumen">
			<div class="contenedor_default">
				<!-- CUENTAS -->
				<header class="header_contenedor">
					<h3>Cuentas</h3>
				</header>


				<main class="cuentas">

					<c:forEach items="${cuentas}" var="cuenta">

						<div class="card-cuenta">
							<div>
								<div class=" cuenta_icono">
									<iconify-icon class="icono" icon="mdi:bank" width="32"></iconify-icon>
								</div>
								<h4>${cuenta.nombre}</h4>
								<p>${cuenta.total}</p>
							</div>
							<div class="botones_transacciones">

								<a href="RegistrarMovimientosController?ruta=nuevoingreso&idCuenta=${cuenta.id}"> <iconify-icon icon="ph:arrow-down-bold"
										width="18"></iconify-icon> <span class="texto_boton">Depositar</span>
								</a> 
								
								<a href=""> <iconify-icon icon="ph:arrow-up-bold"
										width="18"></iconify-icon> <span class="texto_boton">Retirar</span>
								</a> 
								
								<a href=""> <iconify-icon icon="mingcute:transfer-fill"
										width="18"></iconify-icon> <span class="texto_boton">Transferir</span>
								</a>

							</div>
						</div>
					</c:forEach>


				</main>

			</div>


			<!-- CATEGORIAS -->
			<div class="contenedor_default">

				<header class="header_contenedor">
					<h3>Resumen por categorÃ­a</h3>

				</header>
				<main class="clasificacion">
					<div class="card-cuenta">
						<div>
							<div class=" cuenta_icono">
								<iconify-icon class="icono" icon="mdi:bank" width="32"></iconify-icon>
							</div>
							<h4>Comida</h4>
							<p>-500.00</p>
						</div>
						<div class="botones_transacciones">

							<a href="ingreso.html"> <iconify-icon
									icon="ph:arrow-down-bold" width="18"></iconify-icon> <span
								class="texto_boton">Movimientos</span>
							</a>

						</div>
					</div>

				</main>
			</div>

			<!-- TRANSACCIONES RECIENTES -->
			<div class="contenedor_default grid_abajo">

				<header class="header_contenedor">
					<h3>Transacciones Recientes</h3>
				</header>

				<main id="transacciones" class="mostrar">
					<div class="transaccion">
						<div class="transaccion_icono">
							<iconify-icon class="icono deposito_color"
								icon="ph:arrow-down-bold" width="18"></iconify-icon>
						</div>
						<div class="id_transaccion">1</div>
						<div class="transaccion_info">
							<p>10/10/2020</p>
						</div>

						<div class="cuenta">
							<div class="cuenta_icono">
								<iconify-icon class="icono" icon="mdi:bank" width="20"></iconify-icon>
							</div>
							<div class="cuenta_info">
								<p>Pichincha</p>
							</div>
						</div>

						<div class="concepto">
							<p>Pago de nÃ³mina de mi trabajo</p>
						</div>

						<div class="transaccion_monto">
							<h4>1000.00</h4>
						</div>
					</div>

					<div class="transaccion">
						<div class="transaccion_icono">
							<iconify-icon class="icono retiro_color" icon="ph:arrow-up-bold"
								width="18"></iconify-icon>
						</div>
						<div class="id_transaccion">2</div>
						<div class="transaccion_info">
							<p>10/10/2020</p>
						</div>

						<div class="cuenta">
							<div class="cuenta_icono">
								<iconify-icon class="icono" icon="mdi:wallet" width="20"></iconify-icon>
							</div>
							<div class="cuenta_info">
								<p>Efectivo</p>
							</div>
						</div>

						<div class="concepto">
							<p>Libro "Contabilidad bÃ¡sica"</p>
						</div>

						<div class="transaccion_monto">
							<h4>-1000.00</h4>
						</div>
					</div>


					<!--Responsive-->
					<div class="transaccion_responsive">
						<div class="boton boton1">
							<p class="id_transaccion">ID: 001</p>
						</div>

						<div class="transaccion_info">
							<h4>Tipo transaccion:</h4>
							<div>
								<div class="transaccion_icono">
									<iconify-icon class="icono deposito_color"
										icon="ph:arrow-down-bold" width="18"></iconify-icon>
								</div>
								<p>Deposito</p>
							</div>
						</div>

						<div class="transaccion_fecha">
							<h4>Fecha:</h4>
							<p>10/10/2020</p>
						</div>

						<div class="cuenta">
							<h4>Cuenta:</h4>
							<div>
								<div class="cuenta_icono">
									<iconify-icon class="icono" icon="mdi:bank" width="20"></iconify-icon>
								</div>
								<div class="cuenta_info">
									<p>Banco</p>
								</div>
							</div>

						</div>

						<div class="transaccion_monto">
							<h4>Valor:</h4>
							<p>1000.00</p>
						</div>
					</div>

					<div class="transaccion_responsive">
						<div class="boton boton1">
							<p class="id_transaccion">ID: 002</p>
						</div>

						<div class="transaccion_info">
							<h4>Tipo transaccion:</h4>
							<div>
								<div class="transaccion_icono">
									<iconify-icon class="icono retiro_color"
										icon="ph:arrow-up-bold" width="18"></iconify-icon>
								</div>
								<p>Retiro</p>
							</div>
						</div>

						<div class="transaccion_fecha">
							<h4>Fecha:</h4>
							<p>10/10/2020</p>
						</div>

						<div class="cuenta">
							<h4>Cuenta:</h4>
							<div>
								<div class="cuenta_icono">
									<iconify-icon class="icono" icon="mdi:wallet" width="20"></iconify-icon>
								</div>
								<div class="cuenta_info">
									<p>Efectivo</p>
								</div>
							</div>

						</div>

						<div class="transaccion_monto">
							<h4>Valor:</h4>
							<p>1000.00</p>
						</div>
					</div>

					<div class="transaccion_responsive">
						<div class="boton boton1">
							<p class="id_transaccion">ID: 001</p>
						</div>

						<div class="transaccion_info">
							<h4>Tipo transaccion:</h4>
							<div>
								<div class="transaccion_icono">
									<iconify-icon class="icono deposito_color"
										icon="ph:arrow-down-bold" width="18"></iconify-icon>
								</div>
								<p>Deposito</p>
							</div>
						</div>

						<div class="transaccion_fecha">
							<h4>Fecha:</h4>
							<p>10/10/2020</p>
						</div>

						<div class="cuenta">
							<h4>Cuenta:</h4>
							<div>
								<div class="cuenta_icono">
									<iconify-icon class="icono" icon="mdi:bank" width="20"></iconify-icon>
								</div>
								<div class="cuenta_info">
									<p>Banco</p>
								</div>
							</div>

						</div>

						<div class="transaccion_monto">
							<h4>Valor:</h4>
							<p>1000.00</p>
						</div>
					</div>

					<div class="transaccion_responsive">
						<div class="boton boton1">
							<p class="id_transaccion">ID: 001</p>
						</div>

						<div class="transaccion_info">
							<h4>Tipo transaccion:</h4>
							<div>
								<div class="transaccion_icono">
									<iconify-icon class="icono deposito_color"
										icon="ph:arrow-down-bold" width="18"></iconify-icon>
								</div>
								<p>Deposito</p>
							</div>
						</div>

						<div class="transaccion_fecha">
							<h4>Fecha:</h4>
							<p>10/10/2020</p>
						</div>

						<div class="cuenta">
							<h4>Cuenta:</h4>
							<div>
								<div class="cuenta_icono">
									<iconify-icon class="icono" icon="mdi:bank" width="20"></iconify-icon>
								</div>
								<div class="cuenta_info">
									<p>Banco</p>
								</div>
							</div>

						</div>

						<div class="transaccion_monto">
							<h4>Valor:</h4>
							<p>1000.00</p>
						</div>
					</div>
				</main>
			</div>
		</div>
	</main>
</body>

</html>