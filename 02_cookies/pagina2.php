<?php

var_dump($_POST);

$nombre = $_POST['nombre'];
$clave= $_POST['clave'];
$sexo = $_POST['hm'];
$guardarPreferencias  = isset($_POST['chkPreferencias']) ? $_POST['chkPreferencias'] : '';


if( $guardarPreferencias != ""){
    //Solo si se pidió guardar las ferenciaas, creamos las cookies
    setcookie("c_nombre", $nombre, 0);
    setcookie("c_clave", $clave, 0);
    setcookie("c_sexo", $sexo, 0);
    setcookie("c_preferencias", $guardarPreferencias, 0);
}else{
    if( isset($_COOKIE)){
        foreach($_COOKIE as $name => $value){
            setcookie($name, '',1);
        }
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>PANEL PRINCIPAL</h1>
    <h5>Bienvenido: <?php echo $nombre ?></h5>
    <br>
    Nos has indicado que tu sexo es: <?php echo $sexo ?>
    <br>
    <hr>
    <a href="borrarcookies.php?borrar=1">Borrar cookies y regresar</a> 
    <br>
    <a href="borrarcookies.php?borrar=0">Regresar</a>
</body>
</html>