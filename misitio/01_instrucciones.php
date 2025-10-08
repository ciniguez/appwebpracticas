NO ES PHP

<?php
# este es un comentario
$nombre = "Carlos";
$edad = 25;
$bandera = true;

# Impresion
echo "<br>";
echo "hola soy" . $nombre;
echo "<br>";

#Arreglos
$numerosPares = array(2,4,6,8,10);
# uso de print_r
print_r($numerosPares);
echo "<br>";
# Uso de var_dump
var_dump($numerosPares);
echo "<br>";
# arrays con clave configurada
$numerosImpares = array("Key1"=>1, "pipo"=>3, "algo"=>5, "final"=>7);
var_dump($numerosImpares);
echo "<br>";

echo "Impresión más visual";
echo "<pre>". print_r($numerosImpares, true) ."</pre>";

# Cabeceras
echo "<h1>CABECERAS</h1>";
echo "<pre>". print_r( getallheaders(), true) ."</pre>";

?>


NO ES PHP