<?php
session_start();

# 1.- Obtengo los datos enviados por POST
# 2.- Si el usuario es el usuario que esta registrado entonces, creo SESIONES
# 3.- Rediccionarle a la parte privada (Bienvenido!)
if($_POST['nombre'] != "" && $_POST['clave']!= ""){
    // Creo las Sesiones
    $_SESSION['nombre'] = $_POST['nombre'];
    $_SESSION['clave'] = $_POST['clave'];
    header("Location:mipanel.php");
}else{
    header("Location:index.php");
}
?>