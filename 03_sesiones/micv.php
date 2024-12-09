<?php
session_start();

if(!isset($_SESSION["nombre"]) && !isset($_SESSION["contrasena"])){
    header("Location:index.php");
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <h1>Mi CV</h1>
    <h2>Usuario logeado: <?php echo $_SESSION["nombre"] ?></h2>
    <hr>
    <h3>Menu de opciones</h3>
    <ul>
        <li><a href="acercade.php">Acerca de</a></li>
        <li><a href="mipanel.php">Panel Principal</a></li>
    </ul>
    <hr>
    <p> <a href="cerrarsesion.php">Cerrar Sesion</a></p>
</body>

</html>