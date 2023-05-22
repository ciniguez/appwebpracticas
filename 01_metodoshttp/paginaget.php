<?php
var_dump($_GET);
echo "<br>";
?>

<html>
    <head></head>
    <body>
        Nombre: <?php echo $_GET['nombre'] ?>
        <p> Su pago con la tarjeta 
            <?php echo $_GET['numtarjeta'] ?> 
            ha sido procesada</p>
    </body>
</html>