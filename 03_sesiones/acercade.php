<?php
session_start();

if(!isset($_SESSION['nombre']) && !isset($_SESSION['clave'])){
    header("Location: index.php");
    exit;
}
?>

<html>
    <head>
    </head>
    <body>
        <h1>Sistema ABC</h1>
        <h2>Acerca de mi...</h2>
        <h3>Usuario logeado: <?php echo $_SESSION['nombre'] ?> </h3>
        <p><a href="cerrarsesion.php">Cerrar Sesion</a></p>
        <hr>
        <h3>Mi ShortBio ... </h3>
        <p>Soy estudiante de la Escuela Politécnica Nacional, en la carrera de Software. </p>
        <hr>
        <p><a href="mipanel.php">Regresar a Mi Panel</a></p>
    </body>
</html>