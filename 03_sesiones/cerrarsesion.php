<?php
session_start();

if( !isset($_SESSION['nombrecito']) && !isset($_SESSION['clavecin'])){
    header("Location:index.php");
}

session_destroy(); #Función de PHP para destruir la sesión activa

header("Location:index.php");

?>