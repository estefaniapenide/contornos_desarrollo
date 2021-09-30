<?xml version="1.0" encoding="UTF-8"?>
<!-- Exemplo sinxelo de transformación XSL -->
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
                version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="alumnos">
        <html>
            <head>
                <title>fundamentos.xsl</title>
            </head>
            <body>
                <h1>Alumnos</h1>
                <ul>                
                    <xsl:for-each select="alumno">
                        <li>
                            <xsl:value-of select="apelidos"/>, 
                            <xsl:value-of select="nome"/>
                        </li>
                    </xsl:for-each>
                </ul>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
