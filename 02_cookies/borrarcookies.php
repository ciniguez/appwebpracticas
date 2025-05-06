<?php

if(isset($_GET)){
    // Elimino las ccokies
    if($_GET['borrar']==1 && isset($_COOKIES)){
        setcookie("c_usuario","");
        setcookie("c_clave","");  
        setcookie("c_sexo","");
    }
        header("Location: index.php");
    
 
}



?>