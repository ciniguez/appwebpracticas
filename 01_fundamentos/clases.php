<?php

class Persona{
    private $nombre;
    private $edad;

    function __construct( $nombre, $edad){
        $this->nombre = $nombre;
        $this->edad = $edad;
    }

    function saludar(){
        return "Hola, soy ". $this->nombre . ", y tengo ". $this->edad . " años";
    }

}

$persona = new Persona("Carlos", 22);
echo $persona->saludar();


?>