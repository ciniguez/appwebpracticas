<?php
session_start(); # levantar el servicio de sesiones del servidor

if( $_POST["nombre"] != "" && $_POST["clave"] != ""){
    //Crear sesiones
    $_SESSION["nombrecito"] = $_POST["nombre"];
    $_SESSION["clevecin"] = $_POST["clave"];
    header("Location:mipanel.php");
}else{
    header("Location:index.php");
}

?>