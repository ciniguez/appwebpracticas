<?php 
session_start();
# Obtener los datos enviados

if($_SERVER['REQUEST_METHOD'] === "POST"){

    if($_POST['nombre'] === "Demo" && $_POST['clave'] == "demo123"){
        # Si todo va bien, entonces le creamos la sesion y le dejamos entrar ami panel
        $_SESSION['nombre'] = $_POST['nombre'];
        $_SESSION['clave'] = $_POST['clave'];
    }else{
        # Caso contrario lo regresamos al index
        header("Location: index.php");
        exit;
    }
}

if($_SERVER['REQUEST_METHOD'] === 'GET'){
    if(!isset($_SESSION['nombre']) && !isset($_SESSION['clave'])){
    header("Location: index.php");
    exit;
}
}

?>

<html>
    <head>
    </head>
    <body>
        <h1>Sistema ABC</h1>
        <h2>Panel Principal</h2>
        <h3>Usuario logeado: <?php echo $_SESSION['nombre'] ?> </h3>
        <p><a href="cerrarsesion.php">Cerrar Sesion</a></p>
        <hr>
        <h2>Menu del Sistema</h2>
        <ul>
            <li><a href="acercade.php">Acerca de</a></li>
            <li><a href="experiencia.php">Mi experiencia</a></li>
        </ul>

        <hr>
    </body>
</html>