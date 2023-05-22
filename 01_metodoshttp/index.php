<html>
<head></head>
<body>
    <h1>ENVIO POR GET</h1>
    <form method="GET" action="paginaget.php">
        <fieldset>
            Nombre: <input type="text" name="nombre"><br>
            Email: <input type="text" name="email"><br>
            Num. tarjeta: <input type="text" name="numtarjeta"><br>
            CVV. : <input type="text" name="cvv"><br>
            <input type="submit" value="Realizar Pago">
        </fieldset>
    </form>

    <br>
    <br>
    <h1>ENVIO POR POST</h1>
    <form method="POST" action="paginapost.php">
        <fieldset>
            Nombre: <input type="text" name="nombre"><br>
            Email: <input type="text" name="email"><br>
            Num. tarjeta: <input type="text" name="numtarjeta"><br>
            CVV. : <input type="text" name="cvv"><br>
            <input type="submit" value="Realizar Pago">
        </fieldset>
    </form>
</body>

</html>