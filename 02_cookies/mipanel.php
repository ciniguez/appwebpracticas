<?php

$nombre = $_POST['nombre'];
$clave = $_POST['clave'];
$genero = $_POST['hm'];

# SETEO LA COOKIE
setcookie("c_usuario", $nombre, 0);
setcookie("c_clave", $clave, 0);
setcookie("c_sexo", $genero, 0);

echo "Impresion de array COOKIE <br>";
var_dump($_COOKIE);



?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Panel Principal</h1>
    <h1>Bienvenido(a) <?php echo $_POST['nombre'] ?> </h1>
    
    
    <hr>
    <a href="borrarcookies.php?borrar=1">Borrar cookies y regresar</a>
    <br>
    <a href="borrarcookies.php?borrar=0">Regresar</a>

</body>
</html>