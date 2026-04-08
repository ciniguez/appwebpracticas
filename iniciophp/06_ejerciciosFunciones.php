<?php

$textoEntrada = (!empty($_POST['texto']))? $_POST['texto']: ' ejemplo de php con funciones nativas    ';
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Catálogo de funciones nativas de PHP</h1>

    <h2>Ejemplo de cadenas</h2>
    <form action="" method="post">
        <fieldset>
            <legend>Procesar texto</legend>
            <p>
                <label for="texto">Texto de prueba:</label>
                <input type="text" name="texto" id="texto" value="<?php echo $textoEntrada ?>" placeholder="Escribe un texto de prueba"/>
            </p>
            <p>
                <input type="submit" value="Procesar"/>
            </p>
        </fieldset>
    </form>

    <p>Texto seguro con htmlspecialchars(): <?php echo htmlspecialchars($textoEntrada, ENT_QUOTES, 'UTF-8')?></p>
    <p>Texto sin espacios con trim(): <?php echo trim($textoEntrada)?></p>
    <p>Longitud con strlen(): <?php echo strlen($textoEntrada)?></p>
    <p>Primera letra con Mayuscula con ucfirst(): <?php echo ucfirst($textoEntrada)?></p>
    <p>Reemplazo con str_replace(): <?php echo str_replace('php', 'PHP', $textoEntrada)?></p>
    <p>Fragmento con substr(): <?php echo substr($textoEntrada,0, 18)?></p>
    <p>Resultado de empty(): <?php echo empty($textoEntrada) ?></p>

    <h2>Ejemplo de Arrays</h2>

    <?php 
    $frutas =['manzana', 'pera', 'uva'];
    ?>

    <p>Lista con implode(): <?php echo implode(', ' ,$frutas) ?></p>
    <p>Cantidad con count(): <?php echo count($frutas) ?></p>
    <p>Existe "pera" con in_array(): <?php echo in_array('pera', $frutas, true)?></p>
    

</body>
</html>