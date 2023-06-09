<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1> Bienvenido a BestBuy!</h1>
    <!-- Formulario HTML-->
    <form action="mipanel.php" method="POST">
        <fieldset>
            Usuario:<br>
            <!-- Caja de texto-->
            <input type="text" name="nombre" /><br>
            Clave:<br>
            <!-- Caja de texto tipo Password-->
            <input type="password" name="clave" /><br>
            <!-- Botón para enviar el formulario-->
            <input type="submit" name="btnEnviar" />
        </fieldset>
    </form>
</body>

</html>