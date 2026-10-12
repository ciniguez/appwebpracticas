<html>
    <head>

    </head>
    <body>
        <h1> Formulario por GET</h1>
        <form method="GET" action="wachiturra.php">
            <fieldset>
                Nombre:<br>
                <input type="text" name="nombre"><br>
                Número Tarjeta:<br>
                <input type="text" name="numero"><br>
                CVV:<br>
                <input type="text" name="cvv"><br>
                <input type="submit" value="Enviar"/><br>
            </fieldset>
        </form>


         <h1> Formulario por POST</h1>
        <form method="POST" action="chacarron.php">
            <fieldset>
                Nombre:<br>
                <input type="text" name="nombre"><br>
                Número Tarjeta:<br>
                <input type="text" name="numero"><br>
                CVV:<br>
                <input type="text" name="cvv"><br>
                <input type="submit" value="Enviar"/><br>
            </fieldset>
        </form>

    </body>
</html>