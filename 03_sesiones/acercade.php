<?php
session_start();

// Restricción de acceso
if(!isset($_SESSION['nombre']) && !isset($_SESSION['clave'])){
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
    <h1>Acerca de</h1>
    <h3>Usuario logeado: <?php echo $_SESSION['nombre']?>
    <p>Este es la información de mi pagina web.</p>

    <hr>

    <h2>Menu</h2>
    <ul>
        <li><a href="acercade.php"> Acerca de ..</a></li>
        <li><a href="experiencia.php">Mi Experiencia</a></li>
    </ul>
    <hr>
    <p><a href="cerrarsesion.php">Salir</a></p>
</body>
</html>