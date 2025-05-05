<?php

?>

<html>
    <head>

    </head>

    <body>
        <h1> Petición por GET</h1>
        <form method="GET" action="resultado.php">
            <fieldset>
                <legend>Información para Pago Virtual</legend>
                Nombre:<br/>
                <input type="text" name="nombre"/><br/>
                Edad:<br/>
                <input type="text" name="edad"/><br/>
                <br/>
                <input type="submit" value="Enviar"/>
            </fielset>
        </form>

        <h1> Petición por POST</h1>
        <form method="POST" action="resultado.php">
            <fieldset>
                <legend>Información para Pago Virtual</legend>
                Nombre:<br/>
                <input type="text" name="nombre"/><br/>
                Edad:<br/>
                <input type="text" name="edad"/><br/>
                <br/>
                <input type="submit" value="Enviar"/>
            </fieldset>
        </form>
    </body>
</html>