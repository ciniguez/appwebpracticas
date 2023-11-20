<?php

#este es un comentario

#impresion en pantalla
print "esta es una prueba de impresion";
echo "<br>";
echo "esta es una prueba con echo";

#variables
$pais = "Ecuador";
$numero = "2022";

echo "<br>";
echo "$pais es un país rico y diverso. El $pais  del $numero";

#arrays
$estadocivil = array("soltero", "casado", "divorciado");
echo "<br>";
print_r( $estadocivil );
echo "<br>";
echo $estadocivil[0];
echo "<br>";

$estadocivilConClave = array( "clave1" => "soltero", "clave2"=>"casado");
print_r( $estadocivilConClave);
echo "<br>";
echo $estadocivilConClave["clave2"];
?>