<?php

var_dump($_GET);
$nombre = $_GET["nombre"];

?>

<html>
    <head></head>
    <body>
        <h1>Hola: <?php echo $nombre?></h1>
        
        <p>Tu numero de tarjeta es: <?php echo $_GET["numero"]?> </p>
        <p>Tu codigo de seguridad es: <?php echo $_GET["cvv"]?> </p>
        <p>Te informo que acabas de ser timada por el profe.</p>

        <a href="index.php">Regresa al formulario</a>
    </body>
</html>