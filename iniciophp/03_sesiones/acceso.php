<?php 
session_start();
// AQUI TU CODIGO
// var_dump($_POST);
if($_POST['nombre'] == "admin" && $_POST["clave"] == "admin123"){
    // Creo las sesiones
    $_SESSION["nombre"] = $_POST["nombre"];
    $_SESSION["clave"] = $_POST["clave"];
    header("Location:mipanel.php");
}else{
    header("Location:index.php");
}
?>
