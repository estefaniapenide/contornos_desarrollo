<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>exemplo de php</title>
        <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
    </head>
    <body>
        <?php
        $suma=0;
        for ($i=1;$i<=20;$i=$i+1)
        {	$suma=$suma+$i;
        }
        echo "<p>A suma total é: ".$suma."</p>";
        ?>
    </body>
</html>
