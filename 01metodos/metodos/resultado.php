<?php

$metodo = "";
if (isset($_POST['nombre']) && isset($_POST['edad']) ){
    $metodo = "POST";
    $nombre = $_POST['nombre'];
    $edad = $_POST['edad'];
}
if(isset($_GET['nombre']) && isset($_GET['edad'])){
    $metodo = "GET";
    $nombre = $_GET['nombre'];
    $edad = $_GET['edad'];
}


?>

<html>
    <head></head>
    <body>
    <h1>Información enviada por <?php echo $metodo ?></h1>

    <p>Nombre: <?php  echo $nombre; ?> </p>
    <p>Edad: <?php echo $edad?> </p>

    <h3>Gracias por hacer el pago!</h3>

    <a href="index.php">Regresar al inicio </a>
    </body>
</html>