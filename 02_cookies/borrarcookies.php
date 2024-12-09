<?php
if(isset($_COOKIE)){
  
    setcookie("c_nombre","");
    setcookie("c_clave","");
    setcookie("c_sexo","");

}

header("Location: index.php");
?>