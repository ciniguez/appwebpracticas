<?php

if($_SERVER['REQUEST_METHOD'] !== 'POST'){
    header("Location: index.php");
    exit;
}

# Definición de Variables (parámetros de entrada) con validación.
$nombre = is_string($_POST['nombre'] ?? null) ? trim($_POST['nombre']) : '';
$clave = is_string($_POST['clave'] ?? null) ? trim($_POST['clave']) : '';
$sexo = $_POST['hm'] ?? '';
$recordarme = isset($_POST['chkRecordarme']);

if($nombre === '' || $clave === '' || !in_array($sexo, ['h','m'], true)){
    header('Location: index.php');
    exit;
}

# Armamos la cookie
$opciones =[
    'expires' => 0,
    'httponly' => true,
    'secure'=> !empty($_SERVER['HTTPS']),
    'samesite' => 'Lax',
];

# Si la opción de Recordar fue checkeada
if($recordarme){
    setcookie('c_nombre', $nombre, $opciones);
    setcookie('c_sexo', $sexo, $opciones);
    setcookie('c_recordarme', 1 , $opciones);
}
# Si la opcion de recordar no fue chekeada
else{
    foreach(['c_nombre', 'c_sexo', 'c_recordarme'] as $cookie){
        setcookie( $cookie, '', 0);
    }
}



?>

<html>
    <head>
    </head>
    <body>
        <h1>PANEL PRINCIPAL</h1>
        <p>Bienvenido :<?php echo $nombre;?> </p>
        <hr>
        <a href="borrarcookies.php">Borrar cookies y regresar</a>
        <br>
        <a href="borrarcookies.php"> Regresar </a>
    </body>
</html>