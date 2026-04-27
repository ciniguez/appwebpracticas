<?php
// AQUI TU CODIGO
session_start();
session_destroy();

header("Location:index.php");
?>