<?php
include_once ('./controlacceso.php');


    
    if( $_POST['nombre'] == "carlos" && $_POST['clave'] == "carlos123"){
        $_SESSION['nombre'] = $_POST['nombre'];
        $_SESSION['clave'] = $_POST['clave'];
        header("Location: mipanel.php");
    }else{
        header("Location: index.php");
    }

?>