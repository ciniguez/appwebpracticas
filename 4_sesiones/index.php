<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <!-- Formulario HTML-->
    <form action="acceso.php" method="POST">
        <fieldset>
        <!-- Caja de texto-->
        <label for="txtNombre">Nombre:</label><br>
        <input id="txtNombre" type="text" name="nombre" required/><br>
        <!-- Caja de texto tipo Password-->
        <label for="txtClave">Clave:</label><br>
        <input id="txtClave" type="password" name="clave" required/><br>
        <!-- Botón para enviar el formulario-->
        <input type="submit" name="btnEnviar" />
        </fieldset>
    </form>
</body>

</html>