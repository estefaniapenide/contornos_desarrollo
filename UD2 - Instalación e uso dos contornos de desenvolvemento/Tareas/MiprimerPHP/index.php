<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title>Hola mundo</title>
        <style>
            body {
            font-family: courier;
            font-size: 12pt;
            color: #000000;
            }
           #rojo{color:red}
           .azul{color:blue;
                    background-color:lightblue
           }
             h1 {font-family: Verdana;
                   color:dodgerblue;
                   font-weight: bolder;
             }       
        </style>
    </head>
    <body>
        <h1>Mi primera página en html</h1>
        <div id="rojo">Mi nombre es Estefania</div>
        <span class="azul">
        <?php
        echo "Hola mundo Estefania";
        // put your code here
        ?>
        </span>
    </body>
</html>
