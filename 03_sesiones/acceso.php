<?php
session_start();

//Obtener los datos que me envía el formulario login
$nombre = $_POST["nombre"];
$clave = $_POST["clave"];

if ($nombre == "carlos" && $clave == "carlos123") {
    //Crear sesion
    $_SESSION["nombre"] = $nombre;
    $_SESSION["contrasena"] = $clave;
    //Le dejo entrar a la zona privada
    header("Location:mipanel.php");

} else {
    //le regreso al index
    header("Location:index.php");
}
