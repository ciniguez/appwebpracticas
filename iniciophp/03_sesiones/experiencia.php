<?php
// AQUI TU CODIGO
session_start();
if( !isset($_SESSION['nombre']) || !isset($_SESSION["clave"])){
    header("Location:index.php");
}
?>

<html>
    <head>
    </head>
    <body>
        <h1>Experiencia Profesional</h1>
        <h3>Usuario logeado: <?php echo $_SESSION["nombre"] ?></h3>
        <p><a href="mipanel.php">Ir a Mi Panel</a></p>
        <hr>
        <p><a href="cerrarsesion.php">Cerrar Sesión</a></p>
    </body>
</html>