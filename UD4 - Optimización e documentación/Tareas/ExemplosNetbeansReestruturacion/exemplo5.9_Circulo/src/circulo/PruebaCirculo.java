/*
 * Clase PruebaCirculo utilizada como exemplo para o
 * apartado 5.9 "Mover clase a outro package"
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
