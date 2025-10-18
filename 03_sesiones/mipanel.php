<?php
session_start();
//Restriccion de punto de acceso
if(!isset($_SESSION["nombre"]) && !isset($_SESSION["clave"])){
    header("Location:index.php");
}


?>

<html>
    <head>
    </head>
    <body>
        <h1>Panel Principal</h1>
        <h3>Usuario logeado: <?php echo $_SESSION["nombre"];  ?></h3>
        
        <hr>
        <h2>Menu</h2>
        <ul>
            <li><a href="acercade.php">Acerca de</a></li>
            <li><a href="experiencia.php">Mi experiencia</a></li>
        </ul>

        <hr>
        <p><a href="cerrarsesion.php">Cerrar Sesion</a></p>
    </body>
</html>