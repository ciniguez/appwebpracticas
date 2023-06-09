<?php

class Fichero{
    private $nombre;

    function __construct(){

    }
    function getContenido(){
        // leo el fichero;
        // ..
        // ..
        $contenido = array("Pantalon", "Camisas", "Zapatos");
        return $contenido;
    }
}

?>