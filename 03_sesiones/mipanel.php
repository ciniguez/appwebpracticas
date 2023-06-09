<?php 
session_start(); //Iniciado el motor de sesiones

require_once('./modelo/Fichero.php');

$ficheroInstancia = new Fichero();
$contenido = $ficheroInstancia->getContenido();

if(!isset($_SESSION["nombre"])){
    if($_POST["nombre"] != "" && $_POST["clave"] != ""){
        //Creo las sesiones
        $_SESSION['nombre'] = $_POST['nombre'];
    }else{
        header('Location: index.php');
    }

}



?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mi Panel</title>
</head>
<body>
    <h1>Panel Principal de BEST BUY</h1>
    <h3>Bienvenido: <?php echo $_SESSION['nombre'] ?></h3>
    <br>
    <p><a href="otrapagina.php">Calzado</a></p>
    <p><a href="cerrarsesion.php">Cerrar Sesion</a></p>

    <ul>
        <?php  foreach($contenido as $item){ ?>
            <li><?php echo $item ?></li>
        <?php } ?>
    </ul>
</body>
</html>