<?php
require_once 'Persona.php';
require_once 'ConexionBDD.php';

try {
	$conexionBDD = new ConexionBDD();

	// 1. Crear un objeto Persona.
	$persona = new Persona('Ana', 'Gomez', 29);

	// 2. Insertar la persona en la base de datos.
	$idInsertado = $conexionBDD->insertarPersona($persona);
	$persona->setId($idInsertado);

	// 3. Obtener todas las personas.
	$todasLasPersonas = $conexionBDD->obtenerTodasLasPersonas();

	// 4. Obtener una persona por su ID.
	$personaPorId = $conexionBDD->obtenerPersona($idInsertado);

	// 5. Actualizar la persona.
	$persona->setNombre('Ana Maria');
	$persona->setEdad(30);
	$actualizada = $conexionBDD->actualizarPersona($persona);

?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>Operaciones con Persona y ConexionBDD</h2>
	<p>Persona insertada con ID: <?php echo $idInsertado ?></p>

	<h3>Todas las personas</h3>
	<?php 
	foreach ($todasLasPersonas as $item) {
		echo 'ID: ' . $item->getId() . ' | ';
		echo 'Nombre: ' . $item->getNombre() . ' | ';
		echo 'Apellido: ' . $item->getApellido() . ' | ';
		echo 'Edad: ' . $item->getEdad() . PHP_EOL;
        echo '<br>';
	}
	?>

	<h3>Persona obtenida por ID</h3>
    <?php
	if ($personaPorId !== null) {
		echo 'ID: ' . $personaPorId->getId() . PHP_EOL;
		echo 'Nombre: ' . $personaPorId->getNombre() . PHP_EOL;
		echo 'Apellido: ' . $personaPorId->getApellido() . PHP_EOL;
		echo 'Edad: ' . $personaPorId->getEdad() . PHP_EOL;
	}
    ?>

	<h3>Actualización</h3>
	<p>Persona actualizada: <?php echo $actualizada ? 'si' : 'no'; ?></p>
</body>
</html>

<?php
} catch (Exception $e) {
    echo "Error: " . $e->getMessage();
}
?>