<?php 
//seteo el directorio donde se guarda el fichero de sesion
//$pathSesiones = $_SERVER['DOCUMENT_ROOT']. "/temporal";
//ini_set("session.save_path", $pathSesiones);
#para iniciar sesión se usa session_start()
session_start();
if($_POST["nombre"] !="" && $_POST["clave"]!=""){
    //Crear sesiones
    $_SESSION['nombre'] = $_POST["nombre"];
    $_SESSION['clave'] = $_POST["clave"];
    header("Location:mipanel.php");
}else{
    header("Location:index.php");
}
?>
