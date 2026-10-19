<?php
session_start();

if(!isset($_SESSION['nombre']) && !isset($_SESSION['clave'])){
    header("Location: index.php");
    exit;
}

http_response_code(201);
?>

<html>
    <head>
    </head>
    <body>
        <h1>Sistema ABC</h1>
        <h2>Experiencia Profesional</h2>
        <h3>Usuario logeado: <?php echo $_SESSION['nombre'] ?></h3>
        <p><a href="cerrarsesion.php">Cerrar Sesion</a></p>
        <hr>
        <h3>Mi experiencia ... </h3>
        <p>Llevo dos años realizando aplicaciones de escritorio y web (en PHP). </p>
        <hr>
        <p><a href="mipanel.php">Regresar a Mi Panel</a></p>
    </body>
</html>