<?php

if (isset($_GET)){
    // Borrar las cookies y regresar
    if ($_GET['borrar'] == 1 && isset($_COOKIE)){
         foreach ( $_COOKIE as $name => $value){
            setcookie( $name, '', 1);
        }
    }
    header( "Location:index.php");
}
?>