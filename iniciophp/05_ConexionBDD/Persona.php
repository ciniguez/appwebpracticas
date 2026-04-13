<?php
require_once 'ConexionBDD.php';
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

	public function toString(){
		return "| Id: ". $this->getId(). 
		" | nombre: ". $this->getNombre().
		" | apellido: ". $this->getApellido().
		" | edad: ". $this->getEdad();
	}

	# metodos operaciones

	/**
	 * Crea una Persona basado en los atributos de la clase Persona
	 * Al final, configura el ID de la persona con el id generado en BDD.
	 */
	public function crear(){
		 $sql = "INSERT INTO persona (nombre, apellido, edad) VALUES (?, ?, ?)";
        
        try {
			$conn = new ConexionBDD();
            $stmt = $conn->getConexion()->prepare($sql);
            $stmt->execute([$this->getNombre(), $this->getApellido(), $this->getEdad()]);
            
			// Configurar el valor del id de la nueva persona.
			$this->setId(  $conn->getConexion()->lastInsertId() );
    
        } catch (PDOException $e) {
            throw new Exception("Error al insertar persona: " . $e->getMessage());
        }
	}
	public function consultarPorId($id){
		$sql = "SELECT * FROM persona WHERE id = ?";
        
        try {
			$conn = new ConexionBDD();
            $stmt = $conn->getConexion()->prepare($sql);
            $stmt->execute([$id]);
            
            $fila = $stmt->fetch();
            if ($fila) {
				$persona = new Persona($fila['nombre'], $fila['apellido'], $fila['edad']);
                $persona->setId($fila['id']);
                return $persona;
            } else {
                return null;
            }
        } catch (PDOException $e) {
            throw new Exception("Error al obtener persona: " . $e->getMessage());
        }
	}
	/**
	 * Actualiza Persona.
	 * Conserva su ID y se modifician sus otros atributos.
	 */
	public function actualizar(){
 		$campos = []; 
        $valores = [];
        
        $datos = [
            'nombre' => $this->getNombre(),
            'apellido' => $this->getApellido(),
            'edad' => $this->getEdad()
        ];

        foreach ($datos as $campo => $valor) {
            $campos[] = "$campo = ?";  // Construir la parte SET del SQL
            $valores[] = $valor;
        }
        
        $valores[] = $this->getId();
        
        $sql = "UPDATE persona SET " . implode(", ", $campos) . " WHERE id = ?";
        
        try {
			$cnn = new ConexionBDD();
            $stmt = $cnn->getConexion()->prepare($sql);
            $stmt->execute($valores);
            
            return $stmt->rowCount() > 0;
        } catch (PDOException $e) {
            throw new Exception("Error al actualizar persona: " . $e->getMessage());
        }
	}
	/**
	 * Obtener todas las Personas.
	 */
	public function obtenerTodas(){
		 $sql = "SELECT * FROM persona";
        
        try {
			$cnn = new ConexionBDD();
            $stmt = $cnn->getConexion()->prepare($sql);
            $stmt->execute();
            
            $filas = $stmt->fetchAll();
            $personas = [];
            foreach ($filas as $fila) {
                $persona = new Persona($fila['nombre'], $fila['apellido'], $fila['edad']);
                $persona->setId($fila['id']);
                $personas[] = $persona;
            }
            return $personas;
        } catch (PDOException $e) {
            throw new Exception("Error al obtener personas: " . $e->getMessage());
        }
	}
}
?>
