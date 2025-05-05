<?php

?>

<html>
    <head>
    </head>
    <body>
        <form method="POST" action="mipanel.php">
            <fieldset>
            <legend>Formulario de Login</legend>
            Nombre: <br><input type="text" name="nombre"/><br>
            Clave: <br><input type="password" name="clave"/><br>
            <h3>Selecciona tu género</h3>
            <input type="radio" name="hm" value="h"> Hombre
            <input type="radio" name="hm" value="m"> Mujer

            <br>
            <br>
            <br>
            <input type="submit" value="Ingresar">
            
            </fieldset>
        </form>
    </body>
</html>