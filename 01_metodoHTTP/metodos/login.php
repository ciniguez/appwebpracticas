<html>
    <head></head>
    <body>

    <h1>FORMULARIO CON GET</h1>
    <form method="GET" action="paginaconGET.php">
        Nombre: <input type="text" name="nombre"/><br>
        Mail:<input type="text" name="mail"/><br>
        Num. Tarjeta:<input type="text" name="num"/><br>
        CVV:<input type="text" name="cvv"/><br>

        <input type="submit" value="Realizar el Pago"/>
    </form>

    <br>
    <h1>FORMULARIO CON POST</h1>
    <form method="POST" action="paginaconPOST.php">
        Nombre: <input type="text" name="nombre"/><br>
        Mail:<input type="text" name="mail"/><br>
        Num. Tarjeta:<input type="text" name="num"/><br>
        CVV:<input type="text" name="cvv"/><br>

        <input type="submit" value="Realizar el Pago"/>
    </form>


    </body>
</html>