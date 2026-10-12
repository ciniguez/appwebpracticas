<?php
require_once __DIR__."/funciones.php";

#este es un comentario

# impresion en pantalla
print "esta es una prueba con print";
echo "<br>";
echo "Hola";




# variables

$pais = "Ecuador";
$numero = 2025;
$bandera = true;

nuevaSeccion(" Variables con echo ");
echo $pais. " es rico y diverso. El ". $pais ." del año". $numero;

nuevaSeccion("Arreglos");
# Arreglos =====================================
$estadoCivil =  array("soltero", "casado", "divorciado");
print_r( $estadoCivil);
echo "<br>";
var_dump( $estadoCivil);

echo "<br>";
echo "El indice 2 es : ".$estadoCivil[2];

# Arrays con Clave Valor
$estadoCivilClaveValor = array("k1"=>"soltero", "k2"=>"casado", "k3"=>"divorciado");
echo "<br>";
echo "Obtener la clave k3 :". $estadoCivilClaveValor["k3"];

# Clases y Objetos
nuevaSeccion("Clases y Objetos");

class Persona{
    public $nombre;
    public $edad;

    function __construct( $nombre="", $edad=0){
        $this->nombre = $nombre;
        $this->edad = $edad;
    }

    public function saludar(){
        return "Hola, soy ". $this->nombre ." y tengo ". $this->edad ." años.";
    }
}

$luis = new Persona("Luis", 8);
echo $luis->saludar();


nuevaSeccion("Arrays propios de PHP y muuuuuy útiles");
echo "<pre>";
print_r($_SERVER);
echo "</pre>";
?>