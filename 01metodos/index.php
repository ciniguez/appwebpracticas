<?php

#Este es un comentario
echo 'Hola esto es una impresion con ECHO';
echo "<br/>";
print "Impresion con PRINT";

 # ========= VARIABLES ======
$pais = "Ecuador";
$numero = 2025;

echo "<br/>";
echo "$pais es rico y diverso. El $pais del $numero";
echo "<br/>";
echo $pais. " es rico y diverso. El ". $pais . " del". $numero;

die();

#===== Arrays =====
$estadocivil = array("soltero", "casado", "doctor en informatica"); 
echo "<br/>";
print_r($estadocivil);
echo "<br/>";
var_dump($estadocivil);
echo "<br/>";
echo $estadocivil[1];

$misestados = array("val1"=>"soltero", "val2"=>"casado");
echo "<br/>";
print_r($misestados);

?>