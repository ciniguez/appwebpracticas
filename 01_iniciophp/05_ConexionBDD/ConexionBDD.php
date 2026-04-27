<?php
/**
 * Clase para gestionar la conexión a la Base de Datos
 * Utiliza PDO para mayor seguridad contra inyecciones SQL
 */
class ConexionBDD {
    private $host = 'localhost:8889';
    private $db = 'personas';
    private $user = 'root';
    private $pass = 'root'; // En XAMPP/WAMP suele estar vacío
    private $charset = 'utf8mb4';
    
    private $pdo;
    
    /**
     * Constructor: Establece la conexión a la BD
     */
    public function __construct() {
        $dsn = "mysql:host={$this->host};dbname={$this->db};charset={$this->charset}";
        
        try {
            $this->pdo = new PDO($dsn, $this->user, $this->pass);
            
            // Configurar para que lance excepciones en errores
            $this->pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            
            // Configurar para que devuelva arrays asociativos
            $this->pdo->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_ASSOC);
            
        } catch (PDOException $e) {
            // Si falla la conexión, enviamos un error 500 (Internal Server Error)
            http_response_code(500);
            die("Error de conexión a la base de datos: " . $e->getMessage());
        }
    }
    
    /**
     * Obtener la instancia de PDO
     * @return PDO
     */
    public function getConexion() {
        return $this->pdo;
    }
    
    /**
     * Insertar una nueva persona
     * @param string $nombre
     * @param string $apellido
     * @param int $edad
     * @return int ID de la persona creada
     */
    public function insertarPersona($persona) {
        $sql = "INSERT INTO persona (nombre, apellido, edad) VALUES (?, ?, ?)";
        
        try {
            $stmt = $this->pdo->prepare($sql);
            $stmt->execute([$persona->getNombre(), $persona->getApellido(), $persona->getEdad()]);
            
            return $this->pdo->lastInsertId();
        } catch (PDOException $e) {
            throw new Exception("Error al insertar persona: " . $e->getMessage());
        }
    }
    /**
     * Ejecutar una sentencia SQL.
     * @param String $sql
     * @param Array $arrayParametros
     * @return int ID del objeto creado
     */
    public function ejecutar( $sql, $arrayParametros ){
        
        try {
            $stmt = $this->pdo->prepare($sql);
            if(!empty($arrayParametros) && count($arrayParametros)>0){
                $stmt->execute( implode(", ", $arrayParametros));
            }else{
                $stmt->execute();
            }
            
            return $this->pdo->lastInsertId();
        } catch (PDOException $e) {
            throw new Exception("Error al insertar: " . $e->getMessage());
        }
    }
    
}
?>
