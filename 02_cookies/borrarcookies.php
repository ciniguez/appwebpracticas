<?php

if(isset($_GET)){
    // Elimino las cookies
    if($_GET['borrar'] == 1 && isset($_COOKIE)){
        setcookie("c_nombre","");
        setcookie("c_sexo","");
        setcookie("c_recordarme","");
    }

    // Las dejo como estaban
}
header("Location: index.php");
?>