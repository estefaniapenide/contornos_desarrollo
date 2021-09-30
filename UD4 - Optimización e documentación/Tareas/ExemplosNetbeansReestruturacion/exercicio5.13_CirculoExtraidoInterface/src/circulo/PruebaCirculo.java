/*
 * Exemplo para o apartado 5.13 "Extraer interface"
 * do documento "Reestruturar código Java con NetBeans"
 */
package circulo;

public class PruebaCirculo {

    public static void main(String arg[]) {
        Circulo c = new Circulo();

        c.leerRadio();
        c.Area();
        c.Mostrar();
    }
}
