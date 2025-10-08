<?php

?>
<html>
    <head>
    </head>
    <body>
        <form action="procesador.php" method="POST">
            <fieldset>
                Nombre en tarjeta
                <input type="text" name="nombre">
                <br>
                Numero tarjeta 
                <input type="text" name="numero">
                <br>
                CVV:
                <input type="text" name="cvv" value="867">
                <br>
                <input type="submit" value="Pagar">
            </fieldset>
        </form>
    </body>
</html>
