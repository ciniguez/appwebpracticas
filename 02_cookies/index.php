<?php
# Código PHP
?>

<html>
    <head>
    </head>
    <body>
        <h1>Acceso</h1>

        <form method="POST" action="mipanel.php">
            <fieldset>
                Usuario:<br>
                <input type="text" name="nombre" value=""><br>

                Clave:<br>
                <input type="password" name="clave" value=""><br>

                Sexo:<br>
                <input type="radio" name="hm" value="h"> Hombre
                <input type="radio" name="hm" value="m"> Mujer 
                <br>
                <br>
                <input type="checkbox" name="chkRecordarme"> Recordar mis datos
                <br>
                <br>
                <input type="submit" value="Enviar">

            </fieldset>
        </form>
    </body>
</html>
