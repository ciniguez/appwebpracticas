<?php
//seteo el directorio donde se guarda el fichero de sesion
//$pathSesiones = $_SERVER['DOCUMENT_ROOT']. "/temporal";
//ini_set("session.save_path", $pathSesiones);
#para iniciar sesión se usa session_start()
session_start();
if(!isset ($_SESSION["nombre"]) && !isset($_SESSION["clave"])){
    header("Location:index.php");
}
?>

<html>
    <head>
    </head>
    <body>
        <h1>Experiencia Profesional</h1>
        <h3>Usuario logeado: <?php echo $_SESSION["nombre"];  ?></h3>
        <p><a href="mipanel.php">Regresar a Mi Panel</a></p>
        <hr>
        <p><a href="cerrarsesion.php">Cerrar Sesion</a></p>
    </body>
</html>