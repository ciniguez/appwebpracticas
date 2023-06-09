<?php
session_start();

if(!isset($_SESSION["nombre"])){
    header('Location: index.php');
}
?>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>

<body>
    <h1>Categoria: Zapatos</h1>
    <h3>Usuario Logeado: <?php echo $_SESSION['nombre']?></h3>
    <hr>
    <p><a href="mipanel.php">Ir a Panel Principal</a></p>
    <p><a href="cerrarsesion.php">Cerrar Sesion</a></p>

</body>

</html>