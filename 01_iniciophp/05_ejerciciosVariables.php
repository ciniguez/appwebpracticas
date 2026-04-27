<?php
$fechaActual = new DateTime();
require_once 'persona.php';



?>

<html>
    <head></head>
    <body>
        <h1>Ejemplo de variables y arrays nativos de PHP</h1>

        <h2>Formulario por GET</h2>
        <form action="" method="get">
            <fieldset>
                <legend>Enviar datos por GET</legend>
                <p>
                    <label for="nombre_get">Nombre:</label>
                    <input type="text" id="nombre_get" name="nombre_get" placeholder="Escribe tu nombre"/>
                </p>
                <p>
                    <label for="curso_get">Nombre:</label>
                    <input type="text" id="curso_get" name="curso_get" placeholder="Ejemplo: PHP"/>
                </p>
                <p>
                    <input type="submit" value="Enviar por GET"/>
                </p>
            </fieldset>
        </form>


        <h2>Formulario por POST</h2>
        <form action="" method="post">
            <fieldset>
                <legend>Enviar datos por POST</legend>
                <p>
                    <label for="nombre_post">Nombre:</label>
                    <input type="text" id="nombre_post" name="nombre_post" placeholder="Escribe tu nombre"/>
                </p>
                <p>
                    <label for="curso_post">Nombre:</label>
                    <input type="text" id="curso_post" name="curso_post" placeholder="Ejemplo: PHP"/>
                </p>
                <p>
                    <input type="submit" value="Enviar por POST"/>
                </p>
            </fieldset>
        </form>

        <h2>Resultado de las variables</h2>

        <h3>Contenido de $_GET</h3>
        <p>nombre_get: <?php echo (!empty($_GET['nombre_get']))? $_GET['nombre_get']: 'Sin Valor' ?></p>
        <p>curso_get: <?php echo (!empty($_GET['curso_get']))? $_GET['curso_get'] : 'Sin valor'?></p>

        <h3>Contenido de $_POST</h3>
        <p>nombre_post: <?php echo (!empty($_POST['nombre_post']))? $_POST['nombre_post']: 'Sin valor' ?></p>
        <p>curso_post: <?php echo (!empty($_POST['curso_post']))? $_POST['curso_post']: 'Sin valor'?></p>

        <?php
        $persona = new Presona("Carlos");
        echo $persona->getNombre();
        ?>
        <h2>Contenido de $_SERVER[]</h2>


        <?php include 'cliente.php' ?>
        

        <h3>Ejemplo de DateTime y format()</h3>
        <p>Fecha y hora actual: <?php echo $fechaActual->format('d/m/y H:i:s'); ?></p>
    </body>

</html>