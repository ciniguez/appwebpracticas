<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>Login de Ejemplo</h1>

    <form action="pagina2.php" method="POST">
        <fieldset>
            <label for="txtNombre">Usuario:</label>
            <!-- Caja de texto-->
            <input id="txtNombre" type="text" name="nombre" /><br>
            <!-- Caja de texto tipo Password-->
            <label for="txtClave">Clave:</label>
            <input id="txtClave" type="password" name="clave" /><br>
            <!-- Botón para enviar el formulario-->
             Sexo*:<br>
             <input type="radio" name="hm" value="h"> Hombre<br>
             <input type="radio" name="hm" value="m"> Mujer
             <br>
             <br>
            <input type="submit" name="btnEnviar" />
        </fieldset>
    </form>
</body>

</html>