<?php
/**
 * Clase que representa una persona.
 */
class Persona {
	private $id;
	private $nombre;
	private $apellido;
	private $edad;

	/**
	 * Constructor vacío o con atributos excepto id.
	 * En PHP no se pueden definir dos constructores con distinta firma,
	 * por eso se usan parámetros opcionales.
	 */
	public function __construct($nombre = null, $apellido = null, $edad = null) {
		$this->nombre = $nombre;
		$this->apellido = $apellido;
		$this->edad = $edad;
	}

	public function getId() {
		return $this->id;
	}

	public function setId($id) {
		$this->id = $id;
	}

	public function getNombre() {
		return $this->nombre;
	}

	public function setNombre($nombre) {
		$this->nombre = $nombre;
	}

	public function getApellido() {
		return $this->apellido;
	}

	public function setApellido($apellido) {
		$this->apellido = $apellido;
	}

	public function getEdad() {
		return $this->edad;
	}

	public function setEdad($edad) {
		$this->edad = $edad;
	}
}
?>
