<?php
//$_GET $POST
$ipCliente = $_SERVER['REMOTE_ADDR'];
$userAgent = $_SERVER['HTTP_USER_AGENT'];
$metodoHttp = $_SERVER['REQUEST_METHOD'];
$uriSolicitada = $_SERVER['REQUEST_URI'];
$servidor = $_SERVER['SERVER_NAME'];
$puerto = $_SERVER['SERVER_PORT'];
$protocolo = ( !empty($_SERVER['HTTPS']) )?  'HTTPS': 'HTTP';

?>

<ul>
            <li>REMOTE_ADDR: <?php echo $ipCliente?></li>
            <li>HTTP_USER_AGENT: <?php echo $userAgent?></li>
            <li>REQUEST_METHOD: <?php echo $metodoHttp?></li>
            <li>REQUEST_URI: <?php echo $uriSolicitada?></li>
            <li>SERVER_NAME: <?php echo $servidor?></li>
            <li>SERVER_PORT: <?php echo $puerto?></li>
            <li>HTTP: <?php echo $protocolo?></li>
        </ul>