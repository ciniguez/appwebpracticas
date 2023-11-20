<?php
#borrarcookies.php?borrar=0

if ($_GET['borrar'] == 1) {
    #Borre y regrese al login
    setcookie("c_nombre", '');
    setcookie("c_clave", '');
    setcookie("c_sexo", '');
    setcookie("c_recordarme", '');
}

#navego a la página Login
header("Location: index.php");
?>