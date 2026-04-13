<?php
require_once 'Persona.php';
require_once 'ConexionBDD.php';

echo "<h2>Operaciones con Persona y ConexionBDD</h2>";

try {
	
	$conexionBDD = new ConexionBDD();

	// 1. Crear un objeto Persona.
	echo "<h3>Persona en memoria</h3>";

	$persona = new Persona('Ana', 'Gomez', 29);
	echo $persona->toString(); // Imprime la Persona en memoria

	// 2. Insertar la persona en la base de datos.
	echo "<h3>Persona en creada</h3>";

	$persona->crear();
	echo $persona->toString(); // Imprime la persona creada en BDD
	
	// 3. Obtener todas las personas.
	echo "<h3>Lista de Personas</h3>";

	$todasLasPersonas = $persona->obtenerTodas();
	foreach ($todasLasPersonas as $item) {
		echo $item->toString() .' <br>';
	}

	// 4. Obtener una persona por su ID.
	echo "<h3>Persona por id =". $persona->getId() ."</h3>";

	$personaPorId = $persona->consultarPorId($persona->getId());
	echo $personaPorId->toString(); //Iprime la Persona obtenida

	// 5. Actualizar la persona.
	echo '<h3>Persona con id ='. $persona->getId() .' actualizada </h3>';
	$persona->setNombre('Ana Maria');
	$persona->setEdad(30);
	$persona->actualizar();
	echo $persona->toString();

} catch (Exception $e) {
    echo "Error: " . $e->getMessage();
}
?>