<?php

include_once ('./controlacceso.php');

session_destroy();

header("Location: index.php");
?>