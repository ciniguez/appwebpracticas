<?php

$nombre= $clave = $sexo = "";
$esHombre = $esMujer = $preferencias = false;

if(isset($_COOKIE['c_recordarme']) && $_COOKIE['c_recordarme'] == true){
    $nombre = $_COOKIE['c_nombre'];
    $clave = $_COOKIE['c_clave'];
    $sexo = $_COOKIE['c_sexo'];
    $preferencias = $_COOKIE['c_recordarme'];

    if($sexo == "h"){
        $esHombre = true;
    }else if($sexo == "m"){
        $esMujer = true;
    }
}

?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form method="post" action="pagina2.php">
        <fieldset>
            Usuario*:<br>
            <input type="text" name="usuario" value="<?php echo $nombre; ?>"><br>
            Clave*:<br>
            <input type="password" name="clave" value="<?php echo $clave; ?>"><br><br>

            Sexo*:<br>
            <input type="radio" name="hm" value="h" <?php echo ($esHombre)? "checked": "";?>> Masculino<br>
            <input type="radio" name="hm" value="m"> Femenino<br>
            <br><br>
            <input type="checkbox" name="chkRecordarme" <?php echo ($preferencias)?"checked":""; ?>> Recordar mis datos<br><br>

            <input type="submit" value="Enviar">
        </fieldset>
    </form>
</body>
</html>