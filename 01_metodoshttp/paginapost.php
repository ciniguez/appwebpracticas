<?php
var_dump($_POST);
echo "<br>";
?>

<html>
    <head></head>
    <body>
        Nombre: <?php echo $_POST['nombre'] ?>
        <p> Su pago con la tarjeta 
            <?php echo $_POST['numtarjeta'] ?> 
            ha sido procesada</p>
    </body>
</html>