<?php
# Código PHP
$nombre = $sexo = "";
$esHombre = $esMujer = $preferencias = false;

# Llenar las variables si "Recordarme" fue seleccionado

if( isset($_COOKIE['c_recordarme']) && $_COOKIE['c_recordarme']){
    $nombre = isset($_COOKIE['c_nombre'])? $_COOKIE['c_nombre'] : "";
    $preferencias = $_COOKIE['c_recordarme'];
    $sexo=  isset($_COOKIE['c_sexo']) ? $_COOKIE['c_sexo'] : "";
    if($sexo!= ""){
        $esHombre = ($sexo === 'h')? true : false;
        $esMujer = ($sexo === 'm')? true : false;
    }
}
?>

<html>
    <head>
    </head>
    <body>
        <h1>Acceso</h1>

        <form method="POST" action="mipanel.php">
            <fieldset>
                Usuario:<br>
                <input type="text" name="nombre" value="<?php echo $nombre ?>"><br>

                Clave:<br>
                <input type="password" name="clave" value=""><br>

                Sexo:<br>
                <input type="radio" name="hm" value="h" <?php echo ($esHombre)? "checked" : ""  ?> > Hombre
                <input type="radio" name="hm" value="m" <?php echo ($esMujer)? "checked" : ""  ?>> Mujer 
                <br>
                <br>
                <input type="checkbox" name="chkRecordarme" <?php echo ($preferencias)? "checked" : "" ?> > Recordar mis datos
                <br>
                <br>
                <input type="submit" value="Enviar">

            </fieldset>
        </form>
    </body>
</html>
