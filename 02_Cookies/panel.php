<?php

echo var_dump($_POST);

$nombre = $_POST['nombre'];
$clave = $_POST['clave'];
$sexo = $_POST['hm'];
$recordarme =  isset ($_POST['chkRecordarme']) ? $_POST['chkRecordarme'] : "";


if($recordarme != ""){
    #Creo las Cookies
    setcookie("c_nombre", $nombre, 0 );
    setcookie("c_clave", $clave, 0 );
    setcookie("c_sexo", $sexo, 0 );
    setcookie("c_recordarme", $recordarme, 0 );
}else{
    
    #Borrar las cookies, si estas existen
    if ( isset($_COOKIE)){
        foreach( $_COOKIE as $name=> $value){
            #Si el valor de "expires" es omitido o es 0, la cookie expirará al final de la sesión del navegador
            setcookie( $name, '', 1);
        }
    }
    
}

?>

<html>
    <head></head>
    <body>
        <h1>Panel Principal</h1>
        <h2>Bienvenido: <?php echo $nombre ?></h2>
        <hr>
        <a href="borrarcookies.php?borrar=1">Borrar cookies y regresar</a>
        <br>
        <a href="borrarcookies.php?borrar=0">Regresar</a>
        
    </body>
</html>