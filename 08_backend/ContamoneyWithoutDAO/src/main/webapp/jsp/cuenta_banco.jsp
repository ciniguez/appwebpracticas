<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Mi Chauchera</title>

  <script src="https://code.iconify.design/iconify-icon/1.0.7/iconify-icon.min.js"></script>
  <link rel="stylesheet" href="./css/cuenta_banco.css">
  <link rel="stylesheet" href="css/style.css">
</head>

<body>
  <!-- nav -->
  <header class="header_pagina_principal">
    <div class="contenedor_derecha">
      <button class="btn-regresar" onclick="(window.location ='index.html')">
          <iconify-icon class="icono-boton" icon="mdi:arrow-left" width="20"></iconify-icon>
      </button>
      <button class="boton boton2 usuario_shortcut">
          <img src="https://picsum.photos/30" alt="imagen de usuario">
          <p>Usuario</p>
      </button>
  </div>

    <div class="seleccionar_cuenta">
      <iconify-icon class="icono" icon="mdi:bank" width="20"></iconify-icon>
      <select class="cuenta_seleccionada" onchange="location = this.value;">
        <option value="cuenta_banco.html" selected>Banco</option>
        <option value="cuenta_efectivo.html">Efectivo</option>
        <option value="cuenta_tarjeta.html">Tarjeta</option>
      </select>
    </div>

  </header>
  <!-- dashboard de cartera digital -->
  <main class="main_pagina_principal">
    <div class="contenedor_default dash_head">
      <header class="header_contenedor">
        <h3>Banco</h3>
        <button class="boton boton2 color_inactivo_boton">
          <iconify-icon class="icono" icon="carbon:view-filled" width="18"></iconify-icon>
        </button>
      </header>
      <main class="balance">
        <iconify-icon class="icono" icon="cryptocurrency:usd" style="color: white;" width="32"></iconify-icon>
        <h1>1000.00</h1>
      </main>

      <footer class="botones_transacciones">
        <button class="boton boton1" onclick="(window.location ='ingreso.html')">
          <iconify-icon icon="ph:arrow-down-bold" width="18"></iconify-icon>
          <span class="texto_boton">Depositar</span>
        </button>
        <button class="boton boton2 color_inactivo_boton" onclick="(window.location ='egreso.html')">
          <iconify-icon icon="ph:arrow-up-bold" width="18"></iconify-icon>
          <span class="texto_boton">Retirar</span>
        </button>
        <button class="boton boton2 color_inactivo_boton">
          <iconify-icon icon="mingcute:transfer-fill" width="18"></iconify-icon>
          <span class="texto_boton">Transferir</span>
        </button>
      </footer>

    </div>

    <div class="contenedor-resumen contenedor-resumen-important">

      <div class="contenedor_default">
        <!--Clasificacion de retiros-->
        <header class="header_contenedor">

          <h3>Resumen por categoria</h3>
          <button class="boton boton1">
            <iconify-icon icon="mdi:filter-variant" width="18"></iconify-icon>
            <p>Filtrar</p>
          </button>
        </header>

        <main class="clasificacion">
          <button class="boton clasificacion_item">
            <div class="clasificacion_icono">
              <iconify-icon class="icono" icon="mdi:food" width="32"></iconify-icon>
            </div>
            <div class="clasificacion_info">
              <h4>Comida</h4>
              <p>120.00</p>
            </div>
          </button>
          <button class="boton clasificacion_item">
            <div class="clasificacion_icono">
              <iconify-icon class="icono" icon="mdi:transfer" width="32"></iconify-icon>
            </div>
            <div class="clasificacion_info">
              <h4>Transferencia</h4>
              <p>50.00</p>
            </div>
          </button>
          <button class="boton clasificacion_item">
            <div class="clasificacion_icono">
              <iconify-icon class="icono" icon="mdi:briefcase" width="32"></iconify-icon>
            </div>
            <div class="clasificacion_info">
              <h4>Nomina</h4>
              <p>451.00</p>
            </div>
          </button>
          <button class="boton clasificacion_item">
            <div class="clasificacion_icono">
              <iconify-icon class="icono" icon="mdi:school" width="32"></iconify-icon>
            </div>
            <div class="clasificacion_info">
              <h4>Universidad</h4>
              <p>100.00</p>
            </div>
          </button>
        </main>
      </div>

      <div class="contenedor_default grid_abajo">
        <h4>Comida</h4>
        <div class="transaccion-categoria">
          <div class="transaccion_icono">
            <iconify-icon class="icono retiro_color" icon="ph:arrow-up-bold" width="18"></iconify-icon>
          </div>
          <div class="id_transaccion">002</div>
          <div class="transaccion_info">
            <h4>Banco</h4>
          </div>
          <div class="transaccion_info">
            <h4>Universidad</h4>
          </div>
          <div class="transaccion_info">
            <h4>Libro "Contabilidad bÃ¡sica"</h4>
          </div>
          <div class="transaccion_info">
            <h4>16/01/2024</h4>
          </div>
          <div class="transaccion_monto">
            <h4>100.00</h4>
          </div>
        </div>

        <div class="transaccion-categoria">
          <div class="transaccion_icono">
            <iconify-icon class="icono retiro_color" icon="ph:arrow-up-bold" width="18"></iconify-icon>
          </div>
          <div class="id_transaccion">002</div>
          <div class="transaccion_info">
            <h4>Banco</h4>
          </div>
          <div class="transaccion_info">
            <h4>Universidad</h4>
          </div>
          <div class="transaccion_info">
            <h4>Pago de matricula universidad"</h4>
          </div>
          <div class="transaccion_info">
            <h4>26/01/2024</h4>
          </div>
          <div class="transaccion_monto">
            <h4>200.00</h4>
          </div>
        </div>

        <div class="transaccion-categoria-responsive">
          <div class="boton boton1">
            <p class="id_transaccion">ID: 002</p>
          </div>

          <div class="transaccion_info">
            <h4>Tipo transaccion:</h4>
            <div>
              <div class="transaccion_icono">
                <iconify-icon class="icono retiro_color" icon="ph:arrow-up-bold" width="18"></iconify-icon>
              </div>
              <p>Retiro</p>
            </div>
          </div>

          <div class="transaccion_fecha">
            <h4>Fecha:</h4>
            <p>16/01/2024</p>
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
          <div class="transaccion_info">
            <h4>Concepto:</h4>
            <p>Libro "Contabilidad bÃ¡sica"</p>
          </div>
          <div class="transaccion_monto">
            <h4>Valor:</h4>
            <p>100.00</p>
          </div>
        </div>
        <div class="transaccion-categoria-responsive">
          <div class="boton boton1">
            <p class="id_transaccion">ID: 002</p>
          </div>

          <div class="transaccion_info">
            <h4>Tipo transaccion:</h4>
            <div>
              <div class="transaccion_icono">
                <iconify-icon class="icono retiro_color" icon="ph:arrow-up-bold" width="18"></iconify-icon>
              </div>
              <p>Retiro</p>
            </div>
          </div>

          <div class="transaccion_fecha">
            <h4>Fecha:</h4>
            <p>26/01/2024</p>
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
          <div class="transaccion_info">
            <h4>Concepto:</h4>
            <p>Pago de matricula universidad"</p>
          </div>
          <div class="transaccion_monto">
            <h4>Valor:</h4>
            <p>200.00</p>
          </div>
        </div>
        <div class="linea-separadora">
        </div>
        <div class="suma-categoria">
          <h4>Total</h4>
          <div class="transaccion_monto">
            <h4>300.00</h4>
          </div>
        </div>
      </div>



      <div class="contenedor_default grid_abajo">
        <header class="header_contenedor">
          <h3>Transacciones Recientes</h3>

          <button id="boton_transacciones" class="boton" onclick="">
            <iconify-icon class="icono" icon="bxs:up-arrow" width="15"></iconify-icon>
          </button>
        </header>
        <main id="transacciones" class="mostrar">
          <div class="transaccion">
            <div class="transaccion_icono">
              <iconify-icon class="icono deposito_color" icon="ph:arrow-down-bold" width="18"></iconify-icon>
            </div>
            <div class="id_transaccion">001</div>
            <div class="transaccion_info">
              <h4>Deposito</h4>
              <p>10/10/2020</p>
            </div>

            <div class="cuenta">
              <div class="cuenta_icono">
                <iconify-icon class="icono" icon="mdi:bank" width="20"></iconify-icon>
              </div>
              <div class="cuenta_info">
                <p>Banco</p>
              </div>
            </div>

            <div class="concepto">
              <h4>Concepto</h4>
              <p>Pago de nÃ³mina de mi trabajo</p>
            </div>

            <div class="transaccion_monto">
              <h4>1000.00</h4>
            </div>
          </div>
          <div class="transaccion">
            <div class="transaccion_icono">
              <iconify-icon class="icono deposito_color" icon="ph:arrow-down-bold" width="18"></iconify-icon>
            </div>
            <div class="id_transaccion">004</div>
            <div class="transaccion_info">
              <h4>Deposito</h4>
              <p>10/10/2020</p>
            </div>

            <div class="cuenta">
              <div class="cuenta_icono">
                <iconify-icon class="icono" icon="mdi:bank" width="20"></iconify-icon>
              </div>
              <div class="cuenta_info">
                <p>Banco</p>
              </div>
            </div>

            <div class="concepto">
              <h4>Concepto</h4>
              <p>Pago de matricula universidad</p>
            </div>

            <div class="transaccion_monto">
              <h4>1000.00</h4>
            </div>
          </div>

          <div class="transaccion">
            <div class="transaccion_icono">
              <iconify-icon class="icono deposito_color" icon="ph:arrow-down-bold" width="18"></iconify-icon>
            </div>
            <div class="id_transaccion">005</div>
            <div class="transaccion_info">
              <h4>Deposito</h4>
              <p>10/10/2020</p>
            </div>

            <div class="cuenta">
              <div class="cuenta_icono">
                <iconify-icon class="icono" icon="mdi:bank" width="20"></iconify-icon>
              </div>
              <div class="cuenta_info">
                <p>Banco</p>
              </div>
            </div>

            <div class="concepto">
              <h4>Concepto</h4>
              <p>Pago de alimento de perro</p>
            </div>

            <div class="transaccion_monto">
              <h4>1000.00</h4>
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
                  <iconify-icon class="icono deposito_color" icon="ph:arrow-down-bold" width="18"></iconify-icon>
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
                  <iconify-icon class="icono retiro_color" icon="ph:arrow-up-bold" width="18"></iconify-icon>
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
                  <iconify-icon class="icono deposito_color" icon="ph:arrow-down-bold" width="18"></iconify-icon>
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
                  <iconify-icon class="icono deposito_color" icon="ph:arrow-down-bold" width="18"></iconify-icon>
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

</body>

</html>