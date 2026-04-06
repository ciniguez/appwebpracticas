
<html>
    <head></head>
    <body>
        <form>
            <fieldset>
                <label>Nombre</label>
                <br>
                <input type="text" name="nombre"/>
                <br>
                <input type="submit" value="Enviar"/>
            </fieldset>
        </form>

    </body>
</html>


<?php

print "esta es una prueba de impresion";
echo "<br>";
echo "esta es un prueba de impresion";

# ========= VARIABLES ========
$nombre = "Pedro";
$apellido = "Juarez";
echo "<br>";
echo "Hola ". $nombre . "  -- " . $apellido ." ¿Cómo estás?";

# ======= ARRAYS ==========

echo "<br>";
$estadocivil = array("soltero", "casado", "divorciado");
print_r ( $estadocivil );
echo "<br>";
var_dump ( $estadocivil );

# clave y valor
echo "<br>";
$estadocivilClaveValor = array ( "primero" => "soltero", "segundo" => "casado");
var_dump( $estadocivilClaveValor);

# ======= Clases y Objetos ======

class Persona {
    private $nombre;
    private $apellido;

    function __construct( $nombre, $apellido ){
        $this->nombre = $nombre;
        $this->apellido = $apellido;
    }

    function getNombreCompleto(){
        return $this->nombre . " " . $this->apellido;
    }
}

$personita = new Persona( "Carlos", "Iñiguez");


echo "<br>";
echo "Hola, ". $personita->getNombreCompleto();
?>

