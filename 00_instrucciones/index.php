<?php
echo "Hola mundo";
echo "<br>";
print "esta es una prueba con print";

#este es un comentario

# ========== VARIABElES ========
#Cadenas y numeros
$pais = "Ecuador";
$numero = 2023;

#uso de echo para impresion en pantalla
echo "<br><br>";
echo "$pais es rico y diverso. El $pais del $numero";
echo "<br>";
echo $pais. " es rico y diverso. El ". $pais ." del ". $numero;

#boleanos
$bandera1 = true;
$bandera2 = false;

echo "<br>";
echo "Bandera 1: ". $bandera1;
echo "<br>";
echo "Bandera 2: ". $bandera2;

#die("se murio");

#Arrays
$estadoCivil = array("soltero", "Ni Si ni NO", "casado");
echo "<br>";
print_r( $estadoCivil);
echo "<br>";
var_dump( $estadoCivil);

echo "<br>";
echo $estadoCivil[1];

?>