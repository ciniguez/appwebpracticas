<?php   
include_once ('./controlacceso.php');
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
    <h3>Usuario Logeado: <?php echo $_SESSION['nombre']?></h3>
    <hr>

    <h2>Estas en la página MI EXPERIENCIA</h2>
    <ul>
        <li> <a href="acercade.php">Acerca de</a></li>
        <li> <a href="experiencia.php">Mi Experiencia</a></li>
        <li> <a href="cerrarsesion.php">Cerrar Sesion</a></li>

    </ul>

</body>
</html>