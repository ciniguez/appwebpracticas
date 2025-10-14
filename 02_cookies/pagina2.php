<?php
echo var_dump($_POST);
echo '<pre>'. print_r ($_POST, true)."</pre>";

$nombre = $_POST["nombre"];
$clave = $_POST["clave"];
$sexo = $_POST["hm"];
$recordarme = isset( $_POST["chkRecordarme"]) ? $_POST["chkRecordarme"] : false;

if($recordarme){
    // seteo las cookies
    //setcookie("c_nombre", $nombre, time()+60*60*24*30);
    setcookie("c_nombre", $nombre, 0);
    setcookie("c_clave", $clave, 0);
    setcookie("c_sexo", $sexo, 0);
    setcookie("c_recordarme", $recordarme, 0);
}else{
    // Borrar cookies si es que existen

    if( isset($_COOKIE)){
        foreach ( $_COOKIE as $name => $value){
            setcookie( $name, '', 1);
        }
    }
}

?>

<html>
    <head>
    </head>
    <body>
        <h1>PANEL PRINCIPAL</h1>
        <h1>Bienvenido: <?php echo $nombre ?></h1>
        <hr>
        <a href="borrarcookies.php?borrar=1">Borrar cookies y regresar</a>
        <br>
        <a href="borrarcookies.php?borrar=0">Regresar</a>
    </body>
</html>