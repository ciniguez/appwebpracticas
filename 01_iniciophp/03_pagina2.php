<?php
var_dump( $_POST );

var_dump( $_GET );
?>

<html>
    <head></head>
    <body>
        <p>Parámetros enviados por el cliente</p>
        <p>Nombre: <?php echo $_GET['nombre'] ?></p>
        <p>Numero de Tarjeta: <?php echo $_GET['tarjeta']?></p>
        <p>Codigo de seguridad: <?php echo $_GET['codigo']?></p>
    </body>
</html>

