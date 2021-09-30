/*
 * Exemplo para o apartado 5.13 "Extraer interface"
 * do documento "Reestruturar código Java con NetBeans"
 */

package circulo;

import java.util.Scanner;

/*
 * Situados nesta clase Circulo, o ir o menú "Reestructurar / Extraer interface"
 * aparece un formulario con unha lista de tódolos métodos que ten a clase para
 * que podamos escoller cales queremos mandar ó novo interface, ademais dunha
 * caixa onde especificar o nome do novo interface, neste caso chamarémoslle
 * Superficie e só escolleremos o método Area
 */
public class Circulo {

    double Radio;
    double Area;
    Scanner L = new Scanner(System.in);

    public Circulo() {
        Radio = 0;
        Area = 0;
    }

    public void leerRadio() {
        System.out.println("Escribe el valor del Radio:");
        Radio = L.nextDouble();
    }

    public void Area() {
        Area = 3.1416 * Math.pow(Radio, 2);
    }

    public void Mostrar() {
        System.out.println("El Radios es:" + Radio);
        System.out.println("El Area del Circulo es:" + Area);
    }
}