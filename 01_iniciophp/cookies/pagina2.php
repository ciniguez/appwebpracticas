<?php

var_dump($_POST);

# Creo las cookies siempre y cuando se haya seleccionar el "Recordarme"
$nombre = $_POST['usuario'];
$clave = $_POST['clave'];
$sexo = $_POST['hm'];
$recordarme = isset($_POST['chkRecordarme']) ? true : false;

if ($recordarme) {
    setcookie("c_nombre", $nombre, 0);
    setcookie("c_clave", $clave, 0);
    setcookie("c_sexo", $sexo, 0);
    setcookie("c_recordarme", $recordarme, 0);
}else {
    // Elimino las cookies si el usuario no seleccionó "Recordarme"
    setcookie("c_nombre", "", time() - 3600);
    setcookie("c_clave", "", time() - 3600);
    setcookie("c_sexo", "", time() - 3600);
    setcookie("c_recordarme", "", time() - 3600);
}

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
    <h1>Bienvenido: <?php echo $_POST['usuario']; ?></h1>
    <hr>
    <a href="borrarcookies.php">Borrar cookies y regresar</a>
    <br>
    <a href="index.php">Regresar</a>
</body>
</html>