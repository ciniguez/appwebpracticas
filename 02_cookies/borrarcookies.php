<?php

if( isset($_GET)){
    if( isset($_COOKIE) && $_GET['borrar'] == 1){
        setcookie("c_nombre", '', 1);
        setcookie("c_clave", '', 1);
        setcookie("c_sexo", '', 1);
        setcookie("c_preferencias", '', 1);
    }
}



header('Location: index.php');
?>