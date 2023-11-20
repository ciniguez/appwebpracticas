<?php

#Creación de variables
$nombre = $clave = $sexo = "";
$esHombre = $esMujer = $preferencias = false;

 if (isset ($_COOKIE['c_recordarme'] ) && $_COOKIE['c_recordarme'] != ""){
    $preferencias = true;
    $nombre = isset( $_COOKIE['c_nombre']) ? $_COOKIE['c_nombre']: "";
    $clave = isset( $_COOKIE['c_clave']) ? $_COOKIE['c_clave']: "";
    $sexo = isset( $_COOKIE['c_sexo']) ? $_COOKIE['c_sexo']: "";

    if($sexo != ""){
        $esHombre = ($sexo == "h")? true: false;
        $esMujer = ($sexo == "m")? true: false;
    }

 }
?>

<html>

<head></head>

<body>

    <form method="POST" action="panel.php">
        <fieldset>
            Usuario*:<br>
            <input type="text" value="<?php echo $nombre ?>" name="nombre"/><br>

            Clave*:<br>
            <input type="password" value="<?php echo $clave ?>" name="clave"/><br>

            Sexo*:<br>
            <input type="radio" name="hm" value="h" <?php echo ($esHombre)?"checked" : "" ?>> Hombre
            <input type="radio" name="hm" value="m" <?php echo ($esMujer)?"checked" : "" ?>> Mujer
            <br>
            <br>
            <input type="checkbox" name="chkRecordarme" <?php echo ($preferencias)?"checked" : "" ?>> Recordarme?
            <br>
            <br>
            <input type="submit" value="Enviar">
        </fieldset>

    </form>
</body>

</html>