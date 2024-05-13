<?php

session_start();


if(!isset ($_SESSION['nombre']) && 
!isset($_SESSION['clave'])){
    header("Location: index.php");
}

?>