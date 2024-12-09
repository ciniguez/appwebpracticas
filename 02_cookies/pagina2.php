<?php
var_dump($_POST);

echo $_POST["nombre"];

// Creacion de las cookies
setcookie("c_nombre", $_POST["nombre"], 0);
setcookie("c_clave", $_POST["clave"], 0);
setcookie("c_sexo", $_POST["hm"], 0);

print_r( $_COOKIE );
?>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Panel Principal</h1>
    <h1>Bienvenido: <?php  echo $_POST["nombre"] ?></h1>
    <hr>
    <a href="borrarcookies.php">Borrar Cookies</a>
    <br>
    <a href="index.php">Regresar</a>
</body>
</html>

