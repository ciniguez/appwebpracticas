   <?php

   // Elimino las cookies si el usuario no seleccionó "Recordarme"
    setcookie("c_nombre", "", time() - 3600);
    setcookie("c_clave", "", time() - 3600);
    setcookie("c_sexo", "", time() - 3600);
    setcookie("c_recordarme", "", time() - 3600);

    // Navegar al Login
    header("Location: index.php");
    exit();
    ?>