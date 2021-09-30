/*
 * Clase Complementos
 * Calcula o complemento a cobrar dun vendedor en función de
 * ventas realizadas, Km declarados, categoría profesional do vendedor e
 * sección de ventas.
 */
package examen;

public class Complementos {

    private float ventas;       //cualquier valor float
    private float km;           //cualquier valor float
    private short categoria;    //puede ser 1, 2, o 3
    private short seccion;      //puede ser 10 o 50
    private float resultado;    //complemento resultante

    public Complementos(float v, float k, short c, short s) throws Exception {
        if (v < 0) {
            throw new Exception("Erro. " +
                    "As ventas teñen que ser positivas ou 0");
        }
        if (k < 0) {
            throw new Exception("Erro. " +
                    "Os Km teñen que ser positivos ou 0");
        }
        if (c != 1 && c != 2 && c != 3) {
            throw new Exception("Erro. " +
                    "A categoria ten que ser 1, 2 ou 3");
        } else if (s != 10 && s != 50) {
            throw new Exception("Erro. " +
                    "A sección ten que ser 10 ou 50");
        }
        this.ventas = v;
        this.km = k;
        this.categoria = c;
        this.seccion = s;
        resultado = 0;
    }

    public float CalculoComplemento() {
        /* Un vendedor cobra o complemento por Km da súa categoría
        máis o que lle correspondería nas categorías inferiores */
        for (short i = 1; i <= categoria; i++) {
            CalculoComplementoKm(i);
        }
        /* Ao complemento anterior se lle suman as ventas e el complemento
         * por ventas superiores a 1000 */
        CalculoComplementoVentas();
        return resultado;
    }

    public void CalculoComplementoKm(short c) {
        /*Cálculo do complemento por Km */
        float kmresultado = 0;
        if (c == 1) {
            if (seccion == 10) {
                kmresultado = km;
            } else {
                kmresultado = km * 1.5f;
            }
        } else if (c == 2) {
            if (seccion == 10) {
                kmresultado = km * 1.6f;
            } else {
                kmresultado = km * 1.8f;
            }
        } else if (c == 3) {
            if (seccion == 10) {
                kmresultado = km * 2;
            } else {
                kmresultado = km * 2.5f;
            }
        }
        resultado += kmresultado;
    }

    public void CalculoComplementoVentas() {
        /* Cálculo do complemento por ventas */
        if (ventas > 1000) {
            resultado += ventas * 1.5f;
        } else {
            resultado += ventas;
        }
    }
}
